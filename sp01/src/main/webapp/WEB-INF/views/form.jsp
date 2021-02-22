<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폼</title>
</head>
<body>
	<form action="#">
		사용자 : <input type="text" name="username"> <br>
		비밀번호 : <input type="password" name="password"> <br>
		성별 : <input type="radio" name="gender" value="man" checked>남성
				<input type="radio" name="gender" value="woman">여성 <br>
		과목 : <input type="checkbox" name="lec01" value="html"> HTML
				<input type="checkbox" name="lec02" value="css"> CSS
				<input type="checkbox" name="lec03" value="java" checked> JAVA
			
	</form>
</body>
</html>