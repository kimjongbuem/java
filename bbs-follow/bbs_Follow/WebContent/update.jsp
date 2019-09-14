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
<title>JSP 웹사이트 게시판</title>
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
		script.println("alert('입력이 안된 사항이 있습니다 다시확인해주세요')");
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
		<a class="navbar-brand" href="main.jsp">JSP 게시판 웹 사이트</a>
		</div>
		<div class="collapse navbar-collapse" id="navbar">
		<ul class="nav navbar-nav">
			<li><a href="main.jsp">메인</a></li>
			<li class="active"><a href="bbs.jsp">게시판</a></li>
		</ul>
		<%if(userID == null){ %>
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">접속하기<span class="caret"></span></a>
		
			<ul class="dropdown-menu">
				<li><a href="login.jsp">로그인</a></li>
				<li><a class="dropdown-item" href="join.jsp">회원가입</a></li>
			</ul>
			</li>
		</ul>
		<%
		}else{
		%>
			<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">목록<span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><a class="dropdown-item" href="logoutAction.jsp">로그아웃</a></li>
			</ul>
			</li>
		</ul>
		<%
			}
		%>
	</div>
	</nav>
	<form method="POST" action="updateAction.jsp?bbsID=<%=bbsID %>">
		<div class="container">
			<table class ="table table-striped" style="text-align: center; border : 1px; solid #dddddd">
				<thead>
					<tr>
						<th colspan="2" style="background-color :#fdd12d; text-align:center">게시판 글수정 양식</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><input type="text" class="form-control" placeholder="제목" name="bbsTitle" maxlength="50" value=<%=bbs.getBbsTitle()%>>
					</tr>
					<tr>
						<td><textarea style="height : 450px" class="form-control" placeholder="내용" name="bbsContent" maxlength="4096" ><%=bbs.getBbsContent() %></textarea>
					</tr>
				</tbody>
			</table>
			<input type="submit" class="btn btn-primary pull-right" value="글수정">
		</div>
	</form>
</body>
</html>