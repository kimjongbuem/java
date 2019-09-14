package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	private ResultSet rs;
	private PreparedStatement pstmt;
	private Connection conn;
	
	public UserDAO() {
		String dbID = "root"; String dbPassword = "4010kjbv";
		String dbURL = "jdbc:mysql://localhost:3307/BBS?characterEncoding=UTF-8&serverTimezone=UTC";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int login(String userID, String userPassword) {
		String SQL = "SELECT userPassword FROM USER WHERE userID = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword))
					return 1; // 가입 성공적!
				else
					return 0; // 비밀번호 불일치
			}
			return -1; // 아이디 없음 ㅋ
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
		return -2; // database err
	}
	public int join(User user) {
		String SQL = "INSERT INTO USER VALUES(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getUserID());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserGender());
			pstmt.setString(5, user.getUserEmail());
			return pstmt.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
		return -1; // database err
	}
}
