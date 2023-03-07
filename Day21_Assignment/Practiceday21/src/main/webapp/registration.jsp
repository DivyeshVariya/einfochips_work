<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<style >
input{
margin-left:30px;
}
</style>
</head>
<body>
<center>

<h1>Welcome to Registration Page</h1>
<br>

<form action="adddata1">
<label>Name :</label>
<input type="text" name="uname">
<br>
<br>

<label>Email :</label>
<input type="email" name="email">
<br>
<br>

<label>Date Of Birth :</label>
<input type="date" name="dob">
<br>
<br>

<label>Password :</label>
<input type="text" name="Pass">
<br>
<br>

<label>Confirm Password :</label>
<input type="text" name="ConfPass">
<br>
<br>

<button>Submit</button>
</form>
<a href="backTohome">go to home</a>
</center>

</body>
</html>