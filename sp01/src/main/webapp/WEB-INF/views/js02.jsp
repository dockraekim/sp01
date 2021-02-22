<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>템플릿 예제</title>
<style>

	body {
		height: 100%; 
		color: #fff;
		background-color: #333;
	}
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
	
	.mainbtn {
		background-color: #fff;
		color : #333;
		display: inline-block;
		font-size: 1.25rem;
		font-weight: 700;
		text-align: center;
		border-radius:.3rem;
		padding: .75rem, 1.25rem;
		margin-top: 10px;
	}
</style>
</head>
<body>
	<div class="nav">
		<h3 class="company-name">Cover</h3>
		<div class="nav-right-items">
			<div class="nav-item">Home</div>
			<div class="nav-item">Features</div>
			<div class="nav-item">Contact</div>
		</div>
	</div>
	
	<div class="main">
		<div class="title">Cover your page.</div>
		<div class="subtitle">
			Cover is a one-page template for building simple and beautiful home pages. 
			Download, edit the text, and add your own fullscreen background photo to make it your own.
		</div>
		<div class="mainbtn">BUTTON</div>
	</div>
</body>
</html>