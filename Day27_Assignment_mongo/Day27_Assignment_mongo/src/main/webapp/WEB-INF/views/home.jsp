<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<center>
<h1>Welcome to home page....</h1>
<br>
<form action="insert">
Enter Trainee id : <input type="number" name="id" required>
<br>
<br>
Enter Trainee Name : <input type="text" name="name" required>
<br>
<br>
Enter Trainee From City : <input type="text" name="from" required>
<br> 
<br>
<button type="submit">Submit data</button>
</form>
<br>
<hr>
<br>
<h3>${msg}</h3>
<br>
<a href="viewdata">View Data</h3>
</center>
</body>
</html>