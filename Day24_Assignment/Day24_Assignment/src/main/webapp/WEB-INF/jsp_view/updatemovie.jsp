<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update movie</title>
</head>
<body>
<center>
<h1>Update movie....</h1>
<br>
<form action="updatemovie">
Enter the movie name :<input type="text" name="inputmovienameupdate">
<br>
<br> 
<button type="submit">Submit</button>
</form>
<br>
<h3>${msg}</h3>
</center>
</body>
</html>