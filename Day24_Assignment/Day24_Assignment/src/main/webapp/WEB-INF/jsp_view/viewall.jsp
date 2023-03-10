<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View all MOvie</title>
</head>
<body>
<center>
<h1>List of the movies </h1>
<br>
<h3>${list}</h3>
<br>
<a href="updatemoviepage">Update movie by name...</a>
&nbsp;
<a href="deletemoviepage">Delete movie by name...</a>
<br>
<br>
<a href="viewbylanguage?lang=English">View movie by English language...</a>
&nbsp;
<a href="viewbylanguage?lang=Hindi">View movie by Hindi Language...</a>
&nbsp;
<a href="viewbylanguage?lang=Gujarati">View movie by Gujarati Language...</a>
&nbsp;
</center>
</body>
</html>