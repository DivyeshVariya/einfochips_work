<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback form</title>
</head>
<body>
<center>
<h1>: Feedback Form :</h1>
<form action="adddata">
<label>Name : </label>
<input type="text" name="name" required>
<br>

<label>Email : </label>
<input type="email" name="email" required>
<br>

<label>Share your feedback : </label>
<textarea type="text" name="msg" required></textarea>
<br>

<button type="submit">Submit </button>

</form>
</center>
</body>
</html>