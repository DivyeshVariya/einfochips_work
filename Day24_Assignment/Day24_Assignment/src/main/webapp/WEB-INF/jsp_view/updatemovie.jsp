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

<form action="updatedata" method="post">
<label>Movie id :</label>
<input type="number" name="mid" value=${id}>
<br>
<br>

<label>Movie Name :</label>
<input type="text" name="mname" value=${name}>
<br>
<br>

<label>Movie Language :</label>
<input type="text" name="language" value=${director}>
<br>
<br>

<label>Movie Director :</label>
<input type="text" name="mdirector" value=${language}>
<br>
<br>

<button type="submit"> Submit Data </button>
</form>
<br>
<h3>${msg}</h3>
</center>
</body>
</html>