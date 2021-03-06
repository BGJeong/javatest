package java1012;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Exam2 {
	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pwd = "tiger";
		try {
			String ename = "", job = "", dname= "";
			int empno = 0, mgr = 0, sal = 0, emptno = 0, deptno = 0;
			Date hireDate;
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "select ename, dname, job from dept d, emp e where d.deptno = e.deptno";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				ename = rs.getString("ename");
				dname = rs.getString("dname");
				job = rs.getString("job");
				System.out.println(ename+ " " + dname + " " + job);
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
