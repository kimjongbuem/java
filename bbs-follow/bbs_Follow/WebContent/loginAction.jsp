<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="User.UserDAO" %>
<%@ page import="java.io.*" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="User.User" scope="page"/>
<jsp:setProperty property="userID" name="user"/>
<jsp:setProperty property="userPassword" name="user"/>

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
	UserDAO userDAO = new  UserDAO();
	int result = userDAO.login(user.getUserID(), user.getUserPassword());
	if(result == 1){
		session.setAttribute("userID", user.getUserID());
		script.println("<script>");
		script.println("location.href='main.jsp'");
		script.println("</script>");
	}
	if(result == 0){
		script.println("<script>");
		script.println("alert('비밀번호를 다시 입력해주세요')");
		script.println("history.back()");
		script.println("</script>");
	}
	if(result == -1){
		script.println("<script>");
		script.println("alert('아이디랑 비밀번호가 잘못 되었습니다.')");
		script.println("history.back()");
		script.println("</script>");
	}
	if(result == -2){
		script.println("<script>");
		script.println("alert('데이터베이스 오류가 발생하였습니다.')");
		script.println("history.back()");
		script.println("</script>");
	}
%>