<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">
<script src="js/bootstrap.js"></script>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<meta charset="UTF-8" http-equiv="Content-type" content="text/html">
<meta name="viewport" content="width-device-width, initial-scale=1">
<meta charset="UTF-8">
<title>AJAX testings</title>
</head>
<script type="text/javascript">
var searchRequest = XMLHttpRequest();
function searchFunc(){
	searchRequest.open("Post","./UserTestServlet?userName="+encodeURIComponent(document.getElementById("userName").value),true);
	searchRequest.onreadystatechange = searchProcess;
	searchRequest.send(null);
}
function searchProcess(){
	var table = document.getElementById("ajaxTable");
	table.innerHTML = "";
	if(searchRequest.readyState==4 && searchRequest.status == 200){
		var obj = eval('('+searchRequest.responseText+')');
		var result = obj.result;
		for(var i = 0; i<result.length;i++){
			var row = table.insertRow(i);
			for(var j = 0; j<result[i].length;j++){
			var col = row.insertCell(j);
			col.innerHTML =result[i][j].value;
			}
		}
	}
}
var registerRequest = XMLHttpRequest();
function registerFunc(){
	searchRequest.open("Post","./UserRegisterTestServlet?registerName="+encodeURIComponent(document.getElementById("registerName").value)+
			"&registerAge="+ encodeURIComponent(document.getElementById("registerAge").value) +
			"&registerGender="+ encodeURIComponent(document.getElementById("registerGender").value) +
			"&registerEmail="+ encodeURIComponent(document.getElementById("registerEmail").value)
			,true);
	searchRequest.onreadystatechange = registerProcess;
	searchRequest.send(null);
}
function registerProcess(){
	
	if(registerRequest.readyState==4 && registerRequest.status == 200){
		alert("check");
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
		}	
	}
	searchFunc();
}
window.onload = function(){
	searchFunc();
}
</script>
<body>
	<div class="container">
		<div class="form-group row pull-right">
			<div class="col-xs-8">
				<input class="form-control" id="userName" onkeyup="searchFunc()"type="text" size="20">
			</div>
			<div class="col-xs-2">
				<button class="btn btn btn-primary" onclick="searchFunc();">확인</button>
			</div>
		</div>
		<table class="table" style="text-align : center; border:1px solid #dddddd">
			<thead>
			<tr>
				<th style= "background-color : #fafafa; text-align:center;">이름</th>
				<th style= "background-color : #fafafa; text-align:center;">나이</th>
				<th style= "background-color : #fafafa; text-align:center;">성별</th>
				<th style= "background-color : #fafafa; text-align:center;">이메일</th>
			<tr>
			</thead>
			<tbody id = "ajaxTable">
				
			</tbody>
		</table>
	</div>
	<div class="container">
		<table class="table" style="text-align: center; border:1px solid #dddddd">
			<thead>
			<tr>
				<th colspan="2"  style= "background-color : #fafafa; text-align:center;">회원등록양식</th>
			</tr>
			</thead>
			<tbody>
				<tr>
					<td style="background-color:#fafafa"><h5>이름</h5></td>
					<td><input class="form-control" type="text" id="registerName" size="20"></td>
				</tr>
				<tr>
					<td style="background-color:#fafafa"><h5>나이</h5></td>
					<td><input class="form-control" type="text" id="registerAge" size="20"></td>
				</tr>
				<tr>
					<td style="background-color:#fafafa"><h5>성별</h5></td>
					<td>
						<div class="form-group" style="text-align: center">
							<div class="btn-group" data-toggle="buttons">
								<label class="btn btn-primary active">
									<input type="radio" id ="registerGender" value="man">남자
								</label>
								<label class="btn btn-primary active">
									<input type="radio" id="registerGender" value="woman">여자
								</label>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td style="background-color:#fafafa"><h5>이메일</h5></td>
					<td><input class="form-control" type="text" id="registerEmail" size="20"></td>
				</tr>
				<tr>
					<td colspan="2"><button class="btn btn-primary pull-right" onclick="registerFunc();">등록</button></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>