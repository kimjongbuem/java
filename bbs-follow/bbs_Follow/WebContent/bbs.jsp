<%@page import="Bbs.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.io.PrintWriter" %>
<%@page import="Bbs.BbsDAO" %>
<%@page import="Bbs.Bbs" %>
<%@page import="java.util.*" %>
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
		int pageNumber = 1; //기본 1페이지
		if(request.getParameter("pageNumber")!=null){
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
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
	<table class="table">
		<caption style="color: pink;text-align: center" ><font size =  5px>게시판항목</font></caption>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
		</thead>
		<tbody>
		<%
			BbsDAO bbs = new BbsDAO();
			ArrayList<Bbs> list = bbs.getList(pageNumber);
			for(int i = 0; i<list.size();i++){
		%>
			<tr>
			<th scope="row"><%=list.get(i).getBbsID() %></th>
			<td><a href="view.jsp?bbsID=<%=list.get(i).getBbsID()%>"><%=list.get(i).getBbsTitle() %></a></td>
			<td><%=list.get(i).getUserID() %></td>
			<td><%=list.get(i).getBbsDate() %></td>
			</tr>
		<% 		
			}
		%>
		</tbody>
	</table>
	<%
		if(pageNumber != 1){
	%>
		<a href="bbs.jsp?pageNumber=<%=pageNumber -1%>" class="btn btn-success btn-arrow-left">이전 페이지</a>
	<%
		}
	%>
	<%
		if(bbs.nextPage(pageNumber + 1)){
	%>
		<a href="bbs.jsp?pageNumber=<%=pageNumber + 1%>" class="btn btn-success btn-arrow-right">다음 페이지</a>
	<%
		}
	%>
	<div class="text-right">
		<a href="write.jsp" class="btn btn-primary">글쓰기</a>
	</div>
</body>
</html>