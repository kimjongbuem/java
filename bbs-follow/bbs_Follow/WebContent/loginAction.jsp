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
		script.println("alert('�̹� �α����� �Ǿ��ֽ��ϴ�.')");
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
		script.println("alert('��й�ȣ�� �ٽ� �Է����ּ���')");
		script.println("history.back()");
		script.println("</script>");
	}
	if(result == -1){
		script.println("<script>");
		script.println("alert('���̵�� ��й�ȣ�� �߸� �Ǿ����ϴ�.')");
		script.println("history.back()");
		script.println("</script>");
	}
	if(result == -2){
		script.println("<script>");
		script.println("alert('�����ͺ��̽� ������ �߻��Ͽ����ϴ�.')");
		script.println("history.back()");
		script.println("</script>");
	}
%>