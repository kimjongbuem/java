package user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserTestServlet")
public class UserTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charest=UTF-8");
		String userName = request.getParameter("userName");
		response.getWriter().write(getJSON(userName));
	}
	public String getJSON(String userName) {
		StringBuffer result = new StringBuffer();
		result.append("{\"result\":[");
		UserDAO userDAO = new UserDAO();
		ArrayList<User> userList = userDAO.search(userName);
		for(int i = 0; i<userList.size();i++) {
			result.append("[{\"value\": \""+userList.get(i).getUserName()+"\"},");
			result.append("{\"value\": \""+userList.get(i).getAge()+"\"},");
			result.append("{\"value\": \""+userList.get(i).getUserGender()+"\"},");
			result.append("{\"value\": \""+userList.get(i).getUserEmail()+"\"}],");
		}
		result.append("]}");
		return result.toString();
	}
}
