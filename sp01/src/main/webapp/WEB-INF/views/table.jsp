<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테이블 만들기</title>
<style>
	tr {
		background-color:green;
	}
	.top {
		background-color:red;
		height : 100px;
		width : 100px;
	}
	.mid {
		background-color:yellow;
		height : 100px;
		width : 100px;
	}
	.bot {
		background-color:blue;
		height : 100px;
		width : 100px;
	}
	.like {
		background-color:red;
		
	}
	.sub {
		background-color:yellow;
		
	}
	.alaram {
		background-color:blue;
		
	}
</style>
</head>
<body>
	<h1>테이블 만들기</h1>
	<table border="1">
		<tr style="background-color:yellowgreen">
			<th>번호</th>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<tr style="background-color:blue">
			<td>1</td>
			<td>홍길동</td>
			<td>21세</td>
		</tr>
		<tr style="background-color:red">
			<td>2</td>
			<td>허준</td>
			<td>23세</td>
		</tr>
	</table>
	
	<br>
	
	<ol>
		<li>아메리카노</li>
		<li>카푸치노</li>
		<li>핫초코</li>
	</ol>
	<br>
	<ul>
		<li><b>녹차</b></li>
		<li><i>홍차</i></li>
		<li>자스민차</li>
	</ul>
	
	<br>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<tr>
			<td>1</td>
			<td>홍길동</td>
			<td>21세</td>
		</tr>
		<tr>
			<td>2</td>
			<td>허준</td>
			<td>23세</td>
		</tr>
	</table>
	
	<br>
	
	<div class="top">상단</div>
	<div class="mid">중단</div>
	<div class="bot">하단</div>
	
	<span class="like">종아요</span>
	<span class="sub">구독</span>
	<span class="alaram">알림</span>
	
</body>
</html>