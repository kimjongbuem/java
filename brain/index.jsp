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
// �̹����� ������ html�������� �ۼ��� �ؽ�Ʈ�̰� �ѱ��ڵ�� ���ڵ��Ѵ�.
// ��ũ���ø�
	int total = 0;
	for(int i=0; i<100;i++){
		total+=i;
	}
%>

1���� 100������ ���Ѱ���?= <%=total%>
</body>
</html>