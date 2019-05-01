<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
// 이문서의 내용은 html문법으로 작성된 텍스트이고 한글코드로 인코딩한다.
// 스크립플릿
	int total = 0;
	for(int i=0; i<100;i++){
		total+=i;
	}
%>

1부터 100ㄲㅏ지 더한값은?= <%=total%>
</body>
</html>