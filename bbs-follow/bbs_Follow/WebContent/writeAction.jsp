<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="Bbs.BbsDAO" %>
<%@ page import= "java.io.*" %>
<jsp:useBean id="bbs" class="Bbs.Bbs"></jsp:useBean>
<jsp:setProperty property="bbsTitle" name="bbs"/>
<jsp:setProperty property="bbsContent" name="bbs"/>
<% 
	PrintWriter script = response.getWriter();
	String userID = null;
	if(session.getAttribute("userID") != null){
		userID = (String)session.getAttribute("userID");
	}
	if(userID == null){
		script.println("<script>");
		script.println("alert('�α����� ���� �ʾ� ���� ������ �����ϴ�.')");
		script.println("location.href='login.jsp'");
		script.println("</script>");
	}else{
	if(bbs.getBbsContent()==null || bbs.getBbsContent() == null){
		script.println("<script>");
		script.println("alert('�Է����� �ʴ� ������ �ֽ��ϴ�.')");
		script.println("history.back()");
		script.println("</script>");
	}else{
	BbsDAO bbsDAO = new BbsDAO();
	int result = bbsDAO.write(bbs.getBbsTitle(), userID, bbs.getBbsContent());
		if(result == -1){
			script.println("<script>");
			script.println("alert('�۾��⿡ �����Ͽ����ϴ�.')");
			script.println("history.back()");
			script.println("</script>");
		}else{
			script.println("<script>");
			script.println("location.href='bbs.jsp'");
			script.println("</script>");
		}
		}
	}
%>