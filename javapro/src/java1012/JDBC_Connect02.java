package java1012;

import java.sql.*;

public class JDBC_Connect02 {

	public static void main(String[] args) {

		/**
		 * ORACLE JDBC Driver Test ***************************************** String
		 * driver = "oracle.jdbc.driver.OracleDriver"; String url =
		 * "jdbc:oracle:thin:@localhost:1521:orcl";
		 *******************************************************************/

		/** My-SQL JDBC Driver *********************************************/
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest?serverTimezone=Asia/Seoul&useSSL=false";
		/*******************************************************************/

		Connection con = null;
		PreparedStatement ps = null;

		try {

			Class.forName(driver);

			/** ORACLE에서 Connection 객체 ***********************************/
//    con = DriverManager.getConnection(url, "scott", "tiger" );
			/*******************************************************************/

			/** My-SQL에서 Connection 객체 ***********************************/
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			/*******************************************************************/
			String name = "보보";
			String id = "bobo";
			String email = "123123";
			String address = "강남구";
			String sql = "insert into member values (?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, address);
			int result = ps.executeUpdate();
			if(result == 1) {
				System.out.println("등록성공");
			}else {
				System.out.println("등록실패");
			}

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패~!!");
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if(ps != null) ps.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
