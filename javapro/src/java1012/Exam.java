package java1012;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exam {
	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pwd = "tiger";
		try {
			String ename = "", job = "";
			int empno = 0, mgr = 0, sal = 0, comm = 0, emptno = 0, deptno = 0;
			Date hireDate;
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "select * from emp";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				empno = rs.getInt("empno");
				ename = rs.getString("ename");
				job = rs.getString("job");
				mgr = rs.getInt("mgr");
				hireDate = rs.getDate("hireDate");
				sal = rs.getInt("sal");
				comm = rs.getInt("comm");
				deptno = rs.getInt("deptno");
				System.out.println(empno + " " + ename + " " + job + " " + mgr + " " + hireDate + " " + sal + " " + comm
						+ " " + deptno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
