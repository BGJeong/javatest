package java1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InsertBoard {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public InsertBoard() {
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void write() {
		try {
			InsertBoard ib = new InsertBoard();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("작성자 명 입력 : ");
			String writer = br.readLine();
			System.out.println("비밀번호 입력 : ");
			String passwd = br.readLine();
			System.out.println("제목 입력 : ");
			String subject = br.readLine();
			System.out.println("내용 입력 : ");
			String content = br.readLine();

			String sql = "insert into board values(board_seq.nextval,?,?,?,?,sysdate)";
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, writer);
				pstmt.setString(2, passwd);
				pstmt.setString(3, subject);
				pstmt.setString(4, content);
				int result = pstmt.executeUpdate();
				if (result == 1) {
					System.out.println("입력 성공");
				} else {
					System.out.println("입력 실패");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void delete() {
		InsertBoard ib = new InsertBoard();
		String sql = "delete from board where no = ?";
		System.out.println("삭제할 회원 번호를 입력하세요");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String sql2 = "select passwd from board where no = ?";
			String no = br.readLine();
			int a = Integer.parseInt(no);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, a);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void select() {
		InsertBoard ib = new InsertBoard();
		int count = 0;
		try {
			String sql = "select * from board order by no asc";
			int no = 0;
			String writer = "", passwd = "", subject = "", content = "";
			Timestamp reg_date = null;
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("번호\t작성자명\t비밀번호\t제목\t내용\t날짜");
			System.out.println("-------------------------------------");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			while (rs.next()) {
				no = rs.getInt("no");
				writer = rs.getString("writer");
				passwd = rs.getString("passwd");
				subject = rs.getString("subject");
				content = rs.getString("content");
				reg_date = rs.getTimestamp("reg_date");
				System.out.println(no + "\t" + writer + "\t" + passwd + "\t" + subject + "\t" + content + "\t"
						+ sdf.format(reg_date));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update() {
		InsertBoard ib = new InsertBoard();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("수정할 글번호를 입력하세요");
			String no = br.readLine();
			System.out.println("작성자 명을 입력하세요");
			String writer = br.readLine();
			System.out.println("비밀번호를 입력하세요");
			String passwd = br.readLine();
			System.out.println("제목을 입력하세요");
			String subject = br.readLine();
			System.out.println("내용을 입력하세요");
			String content = br.readLine();
			int ino = Integer.parseInt(no);
			String sql ="update board set writer = ?, passwd = ?, subject = ?, content = ?, reg_date = sysdate where no = ?"; 
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setInt(5, ino);
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		InsertBoard ib = new InsertBoard();
		Scanner scan = new Scanner(System.in);
		System.out.println("1.목록보기   2.작성하기  3.삭제하기  4.수정하기");
		int a = scan.nextInt();
		if (a == 1) {
			ib.select();
		} else if (a == 2) {
			ib.write();
		} else if (a == 3) {
			ib.delete();
		} else if(a == 4) {
			ib.update();
		}else {
			System.out.println("목록에 없는 선택");
		}
	}
}
