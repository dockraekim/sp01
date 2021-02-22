<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JS01</title>

<script type="text/javascript">
	function getIdValue(type){
		var name = document.getElementById(type).value;
		alert(name);
	}
	
	function getNameValue(){
		var len = document.getElementsByName("input").length;
		var name = document.getElementsByName("input")[2].value;
		
		for (var i = 0; i < len; i++) {
			alert("총 갯수 : "+len+", name["+i+"] : "+document.getElementsByName("input")[i].value);
			
		}
	}
	
	function getWindowOpen(){
		window.open("https://www.naver.com");
		
	}
</script>
</head>
<body>
	<input type="text" name="input" id="name" value="홍길동"><br>
	<input type="text" name="input" id="phone" value="010-1234-5678"> <br>
	<input type="text" name="input" id="grade" value="4학년"><br>
	
	<h5>getElementById</h5>
	<input type="button" value="이름가져오기" onclick="getIdValue('name')"> <br>
	<input type="button" value="전화번호 가져오기" onclick="getIdValue('phone')"> <br>
	<input type="button" value="학년 	가져오기" onclick="getIdValue('grade')"> <br>
	
	<h5>getElementsByName</h5>
	<input type="button" value="input갯수 가져오기" onclick="getNameValue()" ><br>
	
	<h5>window open</h5>
	<input type="button" value="네이버" onclick="getWindowOpen()"> <br>
	
	<!-- 데이트 이벤트  -->
	
	
	
</body>
</html>