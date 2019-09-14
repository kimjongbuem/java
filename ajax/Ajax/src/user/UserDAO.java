package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {
	private ResultSet rs;
	private PreparedStatement pstmt;
	private Connection conn;
	
	public UserDAO() {
		String dbID = "root"; String dbPassword = "4010kjbv";
		String dbURL = "jdbc:mysql://localhost:3307/AJAX?characterEncoding=UTF-8&serverTimezone=UTC";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
			System.out.println("DB 성공");
		} catch (Exception e) {
			System.out.println("DB 연결에러");
			e.printStackTrace();
		}
	}
	public ArrayList<User> search(String name){
		String SQL = "SELECT* FROM USER WHERE userName LIKE ?";// 이름의 하나만 포함되도 데이터에 출력이되게.
		ArrayList<User> userList = new ArrayList<User>();
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, "%"+name+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("저장 중!");
				User user = new User();
				user.setUserName(rs.getString(1));
				user.setAge(rs.getInt(2));
				user.setUserGender(rs.getString(3));
				user.setUserEmail(rs.getString(4));
				userList.add(user);
			}
		}catch(Exception e) {
			System.out.println("데이터베이스 검색오류");
		}
		return userList;
	}
	public int register(User user) {
		String SQL = "insert into user values(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, user.getUserName());
			pstmt.setInt(2, user.getAge());
			pstmt.setString(3, user.getUserGender());
			pstmt.setString(4, user.getUserEmail());
			return pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("등록오류");
		}
		return -1; // db error
	}
}
