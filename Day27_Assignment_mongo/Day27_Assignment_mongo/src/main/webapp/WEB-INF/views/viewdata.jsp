<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View data</title>
</head>
<body>
<center>
<%@ page import="com.example.Day27_Assignment_mongo.model.Trainee" %>
<%@ page import="java.util.*" %>
<% ArrayList<Trainee> allTrainees=(ArrayList<Trainee>)request.getAttribute("data"); %>
<h1> : Trainee data :</h1>
	<%
		for(Trainee t:allTrainees)
		{
			out.print(t+"<br>");
			
		}
	%>
<br>
<hr>
<br>
<h1>Total records : ${count} </h1>
<br>
<form action="delete">
Enter Trainee id : <input type="number" name="id" required="required">
<br>
<button>delete data</button>
<br>
<h1>${msg} </h1>
<br>
<br>
<h1>${filter} </h1>
<br>
</form>
</center>
</body>
</html>