package java1008;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberInput1 extends JFrame implements ActionListener{

	JTextField name, email, phone;
	JButton input, cancel;
	JPanel p1, p2, p3, p4;

	public void memberInput() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection con = null;
		PreparedStatement pstmt = null;

		String sql;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");
			sql = "INSERT into mem01 (name, email, phone) values (?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name.getText());
			pstmt.setString(2, email.getText());
			pstmt.setString(3, phone.getText());
			
			int a = pstmt.executeUpdate();
			if(a == 1) {
				JOptionPane.showMessageDialog(this, "성공");
				System.out.println("성공");
				name.setText("");
				email.setText("");
				phone.setText("");
				name.requestFocus();
			}else {
				System.out.println("실패");
				JOptionPane.showMessageDialog(this, "실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == input) {
			memberInput();
			
			
		}else if(e.getSource() == cancel) {
			name.setText("");
			email.setText("");
			phone.setText("");
			name.requestFocus();
		}
		
	}
	
	public MemberInput1() {
		super("회원 가입");

		name = new JTextField(20);
		email = new JTextField(20);
		phone = new JTextField(20);

		input = new JButton("회원가입");
		cancel = new JButton("취  소");

		p1 = new JPanel(new GridLayout(3, 1));
		p1.add(new JLabel("이름"));
		p1.add(new JLabel("E-Mail"));
		p1.add(new JLabel("전화번호"));

		p2 = new JPanel(new GridLayout(3, 1));
		p2.add(name);
		p2.add(email);
		p2.add(phone);

		p3 = new JPanel();
		p3.add(p1);
		p3.add(p2);

		p4 = new JPanel();
		p4.add(input);
		p4.add(cancel);

		add(p3, "Center");
		add(p4, "South");

		setBounds(300, 300, 350, 180);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		input.addActionListener(this);
		cancel.addActionListener(this);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MemberInput1 mi = new MemberInput1();
		

	}

	
}
