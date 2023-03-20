<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<center>
<h1>Thanks for your booking...</h1>
<br>
<h1>You have paid - ${paidAmount}</h1>
<br>
<br>
<br>
<h3>: You booked ${tickets} Tickets : <br><br>Ticket id : ${tid} , Ticket Type : ${ttype} , Movie name : ${mname} , Show date : ${sdate} <br> Show Time : ${sname} , Pay by : ${pay}</h3>
<br>
<br>
<h3>Total Booked Economic Tickets : ${BookedEconomicTicket} & Platinum Tickets : ${BookedPlatinumTicket}</h3>
<br>
<br>
<a href="index">Back to Home</a> &nbsp &nbsp <a>Print</a>
</center>
</body>
</html>