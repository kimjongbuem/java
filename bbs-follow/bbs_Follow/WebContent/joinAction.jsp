<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="User.UserDAO" %>
<%@ page import="java.io.*" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="User.User" scope="page"/>
<jsp:setProperty property="userID" name="user"/>
<jsp:setProperty property="userPassword" name="user"/>
<jsp:setProperty property="userName" name="user"/>
<jsp:setProperty property="userEmail" name="user"/>
<jsp:setProperty property="userGender" name="user"/>
<%
	PrintWriter script = response.getWriter();
	String userID = null;
	if(session.getAttribute("userID") !=null){
		userID = (String)session.getAttribute("userID");
	}
	if(userID !=null){
		script.println("<script>");
		script.println("alert('이미 로그인이 되어있습니다.')");
		script.println("location.href='main.jsp'");
		script.println("</script>");
	}
	if(user.getUserID() == null || user.getUserEmail()== null || user.getUserGender() == null ||
			user.getUserName() == null || user.getUserPassword() == null){
				script.println("<script>");
				script.println("alert('입력이 안된 사항이 있습니다 다시확인해주세요')");
				script.println("history.back()");
				script.println("</script>");
			}else{
				UserDAO userDAO = new UserDAO();
				int result = userDAO.join(user);
		
				if(result == -1){
					script.println("<script>");
					script.println("alert('이미 존재하는 아이디 입니다.')");
					script.println("history.back()");
					script.println("</script>");
				}
				else{
					//session.setAttribute("userID", user.getUserID());
					script.println("<script>");
					script.println("location.href='main.jsp'");
					script.println("</script>");
				}
			}
%>