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
<title>JSP ������Ʈ ȸ������</title>
</head>
<body>
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
			<li><a href="bbs.jsp">�Խ���</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">�����ϱ�<span class="caret"></span></a>
		
			<ul class="dropdown-menu">
				<li ><a href="login.jsp">�α���</a></li>
				<li class="active"><a class="dropdown-item" href="#">ȸ������</a></li>
			</ul>
			</li>
		</ul>
	</div>
	</nav>
	<div class="container">
		<div class="col-lg-6">
			<div class="jumbotron" style="padding-top:45px;">
				<h3 style="text-align:center; color:DodgerBlue">ȸ������ ���</h3>
				<form method="POST" action="joinAction.jsp">
				<div class="form-group">
					<input type="text" class="form-control" name= "userID" placeholder="���̵�" maxlength="20">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name= "userPassword" placeholder="��й�ȣ" maxlength="20">
				</div>
				<div class="form-group">
					<input type="text" class="form-control" name= "userName" placeholder="�̸�" maxlength="20">
				</div>
				<div class="btn-group-toggle" data-toggle="buttons" style="text-align:center">
				<label class="btn btn-primary">
					<input type="radio" class="btn btn-primary" name=userGender value="man" autocomplete="off">����
				</label>
				<label class="btn btn-primary">
					<input type="radio" class="btn btn-primary" name=userGender value="woman" autocomplete="off">����
				</label>
				</div>
				<div class="form-group">
					<input type="email" class="form-control" name= "userEmail" placeholder="�̸���" maxlength="20">
				</div>
				<button type="submit" class="btn btn-success btn-block">ȸ������</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>