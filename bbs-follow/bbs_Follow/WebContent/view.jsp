<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="Bbs.Bbs" %>
<%@ page import="Bbs.BbsDAO" %>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width", initial-scale="1">
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="js/bootstrap.js"></script>
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/custom.css">
<meta charset="EUC-KR">
<title>JSP ������Ʈ �Խ���</title>
</head>
<body>
	<%
		String userID = null;
		if(session.getAttribute("userID") !=null){
			userID = (String)session.getAttribute("userID") ;
		}
		int bbsID = 0;
		if(request.getParameter("bbsID") != null){
			bbsID = Integer.parseInt(request.getParameter("bbsID"));
		}
		if(bbsID == 0){
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('�Է��� �ȵ� ������ �ֽ��ϴ� �ٽ�Ȯ�����ּ���')");
			script.println("location.href='bbs.jsp");
			script.println("</script>");
		}
		Bbs bbs = new BbsDAO().getBbs(bbsID);
	%>
	<nav class="navbar navbar-inverse">
		<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed"
		data-toggle="collapse" data-target="#navbar"
		aria-expanded="false"
		>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="main.jsp">JSP �Խ��� �� ����Ʈ</a>
		</div>
		<div class="collapse navbar-collapse" id="navbar">
		<ul class="nav navbar-nav">
			<li><a href="main.jsp">����</a></li>
			<li class="active"><a href="bbs.jsp">�Խ���</a></li>
		</ul>
		<%if(userID == null){ %>
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">�����ϱ�<span class="caret"></span></a>
		
			<ul class="dropdown-menu">
				<li><a href="login.jsp">�α���</a></li>
				<li><a class="dropdown-item" href="join.jsp">ȸ������</a></li>
			</ul>
			</li>
		</ul>
		<%
		}else{
		%>
			<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">���<span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a class="dropdown-item" href="logoutAction.jsp">�α׾ƿ�</a></li>
			</ul>
			</li>
		</ul>
		<%
			}
		%>
	</div>
	</nav>
		<div class="container">
			<table class ="table table-striped" style="text-align: center; border : 1px; solid #dddddd">
				<thead>
					<tr>
						<th colspan="2" style="background-color :#fdd12d; text-align:center">�Խ��� �ۺ���</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td style="width: 20%;">�� ����</td>
						<th colspan="2" style="color : red;text-align:center"><%=bbs.getBbsTitle().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt").replaceAll("\n", "<br>")%></th>
					</tr>
					<tr>
						<td style="width: 20%;">�ۼ���</td>
						<td colspan="2"><%=bbs.getUserID()%></td>
					</tr>
					<tr>
						<td style="width: 20%;">�ۼ�����</td>
						<td colspan="2" ><%=bbs.getBbsDate()%></td>
					</tr>
					<tr>
						<td style="width: 20%;">����</td>
						<td colspan="2 " style="min-height : 200px; text-align:left;"><%=bbs.getBbsContent().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt").replaceAll("\n", "<br>")%></td>
					</tr>
				</tbody>
			</table>
			<a href="bbs.jsp" class="btn btn-primary">���</a>
			<% if(userID != null && userID.equals(bbs.getUserID())){%>
				<a href="update.jsp?bbsID=<%=bbsID%>" class="btn btn-primary">����</a>
				<a href="deleteAction.jsp?bbsID=<%=bbsID %>" class="btn btn-primary">����</a>
			<%
			}
			%>
			</div>
</body>
</html>