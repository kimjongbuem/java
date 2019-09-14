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
			<li class="active"><a href="main.jsp">����</a></li>
			<li><a href="bbs.jsp">�Խ���</a></li>
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
<div class="jumbotron">
  <h1>WEB BBS SITE!</h1>
  <p>�� ������Ʈ�� ��Ʈ��Ʈ������ ���� JSP �� ����Ʈ�Դϴ�. ������ ���ø��� ��Ʈ��Ʈ���� ����߽��ϴ�!</p>
    <p><a class="btn btn-primary btn-lg" href="#" role="button">�ڼ��� �˾ƺ���</a></p>
</div>
</div>
	<div class="container" style="text-align:center;">
		<div id= "myCarousel" class="carousel slide" data-ride="carousel">
			<ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
  		</ol>
  		<div class="carousel-inner">
  			<div class="item active">
  				<img align="left" src="images/dog1.jpg" >
  			</div>
  			<div class="item">
  				<img align="middle" style="margin-left:220px" src="images/dog2.jpg" >
  			</div>
  			<div class="item">
  				<img align="right" src="images/dog3.jpg" >
  			</div>
  		</div>
  		 <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
    <span style="margin-top: 168px;color:#40D23E"class="glyphicon glyphicon-menu-left" aria-hidden="false"></span>
  </a>
  <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
   	<span style="margin-top: 168px; color:#40D23E;" class="glyphicon glyphicon-menu-right" aria-hidden="false"></span>
  </a>
		</div>
	</div>
	</body>
</html>