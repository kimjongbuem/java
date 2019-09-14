<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="css/bootstrap.css">
<script src="js/bootstrap.js"></script>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<meta charset="UTF-8" http-equiv="Content-type" content="text/html">
<meta name="viewport" content="width-device-width, initial-scale=1">
<script src="js/func.js"></script>
<script type="text/javascript">
var request = new XMLHttpRequest();
function searchFunc(){
	request.open("Post","./UserSearchServlet?userName="+ encodeURIComponent(document.getElementById("userName").value), true);
	request.onreadystatechange = searchProcess;
	request.send(null);
}
function searchProcess(){
	var table = document.getElementById("ajaxTable");
	table.innerHTML = "";
	if(request.readyState==4 && request.status == 200){
		var obj = eval('('+request.responseText+')');
		var result = obj.result;
		for(var i = 0; i< result.length;i++){
			var row = table.insertRow(i);
			for(var j = 0; j<result[i].length;j++){
				var cell = row.insertCell(j);
				cell.innerHTML = result[i][j].value;
			}	
		}	
	}
}
window.onload = function(){
	searchFunc();
}
var registerRequest = new XMLHttpRequest();
function registerFunc(){
	request.open("Post","./UserRegisterServlet?userName="+ encodeURIComponent(document.getElementById("registerName").value)+
		"&userAge="+encodeURIComponent(document.getElementById("registerAge").value)+	
		"&userGender="+encodeURIComponent($('input[name=registerGender]:checked')
				.val())+
		"&userEmail="+encodeURIComponent(document.getElementById("registerEmail").value)
		, true);
	request.onreadystatechange = registerProcess;
	request.send(null);
}
function registerProcess(){
	if(registerRequest.readyState==4 && registerRequest.status == 200){
		var result = registerRequest.responseText;
		if(result != 1)
			alert("등록에실패함");
		else{
			var userName = document.getElementById("userName");
			var registerName = document.getElementById("registerName");
			var registerAge= document.getElementById("registerAge");
			var registerGender = document.getElementById("registerGender");
			var registerEmail = document.getElementById("registerEmail");
			registerAge.value = "";
			registerEmail.value="";
			registerName.value="";
			userName.value="";
			searchFunc();
		}
	}	
}

</script>
<title>JSP AJAX</title>
</head>
<body>
	<br>
	<div class="container">
		<div class="form-group row pull-right">
			<div class="col-xs-8">
				<input class="form-control" id="userName" onkeyup="searchFunc();" type="text" size="20"/>
			</div>
			<div class="col-xs-2">
				<button class="btn btn btn-primary" type="button" onclick="searchFunc();">검색</button>
			</div>
		</div>
		<table class="table" style="text-align : center; border:1px solid #dddddd">
		<thead>
			<tr>
				<th style="background-color : #fafafa; text-align : center;">이름</th>
				<th style="background-color : #fafafa; text-align : center;">나이</th>
				<th style="background-color : #fafafa; text-align : center;">성별</th>
				<th style="background-color : #fafafa; text-align : center;">이메일</th>
			</tr>
		</thead>
		<tbody id="ajaxTable">
		</tbody>
		</table>
	</div>
	<div class="container">
		<table class="table"
			style="text-align: center; border: 1px solid #dddddd">
			<thead>
				<tr>
					<th colspan="2" style="background-color: #fafafa text-align:center">회원등록양식</th>
			</thead>
			<tbody>
				<tr>
					<td style="background-color:#fafafa"><h5>이름</h5></td>
					<td><input style="background-color:white" type="text" id="registerName" class="form-control" size="20"></td>
				</tr>
				<tr>
					<td style="background-color:#fafafa"><h5>나이</h5></td>
					<td><input style="background-color:white" type="text" id="registerAge" class="form-control" size="20"></td>
				</tr>
				<tr>
					<td style="background-color:#fafafa"><h5>성별</h5></td>
					<td>
					<div class="form-group" style="text-align">
						<div class="btn-group" data-toggle="buttons">
							<label class="btn btn-primary active">
							<input type=radio name="registerGender" value="man" checked>남자
							</label>
							<label class="btn btn-primary">
							<input type=radio name="registerGender" value="woman">여자
							</label>
						</div>
					</div>
					</td>
				</tr>
				<tr>
					<td style="background-color:#fafafa"><h5>이메일</h5></td>
					<td><input style="background-color:white" type="email" id="registerEmail" class="form-control" size="20"></td>
				</tr>
				<tr>
					<td colspan="2"><button class="btn btn-primary pull-right" onclick="registerFunc();" type = "button">등록</button></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>