<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>템플릿 예제</title>
<style>
	.nav {
		height:80px;
		border-bottom:1px;
		display:flex;
		align-items : center;
	}
	.nav-right-items {
		display: flex;
		margin-left: auto;
	}
	.nav-item {
		margin-left: 10px;
	}
	
	.company-name {
		margin-left: 20px;
		font-weigth:bold;
	}
	
	.main {
		text-align:center;
	}
	
	.title {
		text-align: center;
		font-size:2.5rem;
		font-weight:bold;
	}
	
	.subtitle {
		text-align : center;
		font-size : 1.25rem;
		font-weight : 300;
	}
	
	.main-btns {
		display: flex;
		margin-left: auto;
	}
	
	.mainbtn {
		height: 600px;
		width: 300px;
	}
	
</style>
</head>
<body>

	<div class="nav">
		<h3 class="company-name">Company name</h3>
		<div class="nav-right-items">
			<div class="nav-item">Features</div>
			<div class="nav-item">Enterprise</div>
			<div class="nav-item">Support</div>
			<div class="nav-item">Pricing</div>
		</div>
	</div>
	
	<div class="main">
		<div class="title">Pricing</div>
		<div class="subtitle">
			Quickly build an effective pricing table for your potential customers with this Bootstrap example. 
			It’s built with default Bootstrap components and utilities with little customization.
		</div>
		<div class="main-btns">
			<div class="mainbtn">BUTTON</div>
			<div class="mainbtn">BUTTON</div>
			<div class="mainbtn">BUTTON</div>
		</div>
	</div>
	
</body>
</html>