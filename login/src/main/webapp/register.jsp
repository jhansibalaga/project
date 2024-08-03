<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background-color: rgb(219, 238, 255);
}
body .container {
	width: 30%;
	height: 100vh;
	background-color: #e4e4e4;
	margin: 1% 0 0 35%;
}

.container h2 {
	text-align: center;
	font-size: 2rem;
	padding-top: 2%;
}

.container p {
	text-align: center;
	font-size: 1rem;
	padding-top: 2%;
}

.container form .text input {
	width: 86%;
	height: 40px;
	outline: none;
	border-radius: 5px;
	border-radius: 5px;
	margin: 7% 0 0 5%;
}

.container form input::placeholder {
	font-size: 0.9rem;
	font-weight: 400;
	padding: 20% 10%;
}

.container form h4 {
	padding: 7% 0 0 5%;
}

.container form .container1 {
	width: 100%;
	height: 40px;
	display: flex;
	margin: 2px 0 0 -10px;
}

.container  form .container1 button {
	border-radius: 5px;
	background-color: bisque;
	width: 40%;
	height: 60%;
	font-size: 1rem;
	outline: 0;
	border-radius: 5px;
	margin: 2rem 0 0 -40px;
	color: #333;
}

.container  form .container1 input {
	height: 20px;
	margin: 2rem 0 0 -1rem;
}

.container button {
	margin: 1% 0% 0% 35%;
}

.container h3 {
	padding: 3% 0 0 30%;
	color: blue;
	font-size: 15px;
}

.container h3 a {
	text-decoration: none;
}

.container p a {
	text-decoration: none;
}

img {
	width: 100px;
	height: 100px;
	float: right;
}

h5 {
	font-size: 17px;
	padding: 20px 30px 10px 25px;
}

form select {
	width: 85%;
	height: 40px;
	margin-left:1.5rem;
        margin-top:-8px;  
}
</style>
<%@include file="bootstrap.jsp"%>
</head>
<body>
	<h1
		style="color: blue; text-align: center; font-size: 4rem; padding-top: 2%;">facebook</h1>
	<div class="container">
		<h2>Create a new account</h2>
		<p>It's quick and easy.</p>
		<form action="Signup" method="post">
			<div class="text">
				<input type="text" placeholder="Enter Your First Name"class="form-control" name="firstname"> 
				<input type="text" placeholder="Enter Your Last Name" class="form-control"name="lastname"> 
				<input type="email" placeholder="Enter Your Email" class="form-control" name="email">
				<input type="password" placeholder="password" class="form-control"name="password"> 
				<input type="number"placeholder="Enter your Age" class="form-control" name="age">
			</div>
			<h5>Gender</h5>
			<select name="gender" id="name">
				<option value="Female"></option>
				<option value="Female">Female</option>
				<option value="Male">Male</option>
			</select>
			<p>
			People who use our service may have uploaded your contact information
			to Facebook. <a href="https://www.facebook.com/help">Learn more</a>
		</p>
		<button class="btn btn-outline-success">Sign up</button>
		<h3>
			<a href="https://www.facebook.com/login/?">Already have an
				account?</a>
		</h3>
		</form>
		
	</div>
</body>
</html>
