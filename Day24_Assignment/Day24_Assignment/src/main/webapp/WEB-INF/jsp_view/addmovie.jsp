<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add movie</title>
</head>
<body>
<center>
<h1>Add Movie</h1>

<form action="adddata" method="post">
<!-- <label>Movie id :</label>
<input type="number" name="mid">
<br>
<br> -->

<label>Movie Name :</label>
<input type="text" name="mname">
<br>
<br>

<label>Movie Language :</label>
<select name="language">
<option value="English">English</option>
<option value="Hindi">Hindi</option>
<option value="Gujarati">Gujarati</option>
</select>
<br>
<br>

<label>Movie Director :</label>
<input type="text" name="mdirector">
<br>
<br>

<button type="submit"> Submit Data </button>
</form>
</center>
</body>
</html>