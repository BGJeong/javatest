package java1007;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

class BdExDAO {
	private Connection conn;
	private ResultSet rs;
	
	public BdExDAO() {
		try {
			String dbURL = "jdbc:oracle://localhost:3306/bbs";
			Class.forName("");
			conn = DriverManager.getConnection(dbURL, "scott", "tiger");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class DbEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}