package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserRegisterTestServlet")
public class UserRegisterTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charest=UTF-8");
		String userName = request.getParameter("registerName");
		String userAge = request.getParameter("registerAge");
		String userGender = request.getParameter("registerGender");
		String userEmail = request.getParameter("registerEmail");
		response.getWriter().write(register(userName,userAge,userGender,userEmail)+"");
	}
	private int register(String userName, String userAge, String userGender, String userEmail) {
		User user = new User();
		try {
		user.setUserName(userName);
		user.setUserGender(userGender);
		user.setUserEmail(userEmail);
		user.setAge(Integer.parseInt(userAge));
		}catch(Exception e) {
			return 0;
		}
		return new UserDAO().register(user);
	}
}
