<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="Bbs.Bbs" %>
<%@ page import="Bbs.BbsDAO" %>

<%
PrintWriter script = response.getWriter();
String userID = null;
if(session.getAttribute("userID") != null){
	userID = (String)session.getAttribute("userID");
}
if(userID == null){
	script.println("<script>");
	script.println("alert('�α����� ���ֽñ� �ٶ��ϴ�')");
	script.println("location.href='login.jsp'");
	script.println("</script>");
}
int bbsID = 0;
if(request.getParameter("bbsID") != null){
	bbsID = Integer.parseInt(request.getParameter("bbsID"));
}
if(bbsID == 0){
	script.println("<script>");
	script.println("alert('�����Ͱ� �����ϴ�!')");
	script.println("location.href='bbs.jsp'");
	script.println("</script>");
}
	Bbs bbs = new BbsDAO().getBbs(bbsID);
if(!userID.equals(bbs.getUserID())){
	script.println("<script>");
	script.println("alert('������ �����ϴ�.')");
	script.println("location.href='bbs.jsp'");
	script.println("</script>");
}else{
	BbsDAO bbsDAO = new BbsDAO();
	int result = bbsDAO.delete(bbsID);
	if(result == -1){
		script.println("<script>");
		script.println("alert('�ý��� ������ �۾��� ������ ���� �Ͽ����ϴ�.')");
		script.println("history.back()");
		script.println("</script>");
	}else{
		script.println("<script>");
		script.println("location.href='bbs.jsp'");
		script.println("</script>");
	}
}
%>