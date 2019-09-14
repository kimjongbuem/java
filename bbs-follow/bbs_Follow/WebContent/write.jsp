<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

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
	<form method="POST" action="writeAction.jsp">
		<div class="container">
			<table class ="table table-striped" style="text-align: center; border : 1px; solid #dddddd">
				<thead>
					<tr>
						<th colspan="2" style="background-color :#fdd12d; text-align:center">�Խ��� �۾��� ���</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><input type="text" class="form-control" placeholder="����" name="bbsTitle" maxlength="50">
					</tr>
					<tr>
						<td><textarea style="height : 450px" class="form-control" placeholder="����" name="bbsContent" maxlength="4096"></textarea>
					</tr>
				</tbody>
			</table>
			<input type="submit" class="btn btn-primary pull-right" value="�۾���">
		</div>
	</form>
</body>
</html>