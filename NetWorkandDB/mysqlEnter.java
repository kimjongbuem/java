package NetWorkandDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mysqlEnter {

	public static void main(String[] args) {
		BbsDAO dao = new BbsDAO();

	}

}
class BbsDAO {
	private Connection conn;
	private ResultSet rs;
	
	public BbsDAO()
	{
			try {
				System.out.println("Test Start!");
				String dbURL ="jdbc:mysql://localhost:3307/test?serverTimezone=UTC"; // mysql ... ->
				String dbID="root";
				String dbPassword = "4010kjbv";
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
				System.out.println("success!");
			}catch (ClassNotFoundException e) {
				System.out.println("fail Not found!");
				e.printStackTrace();
			}catch (SQLException e) {
				System.out.println("fail Not sql!");
				e.printStackTrace();
			}
	}
}