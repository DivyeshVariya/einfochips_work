<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show ticket page</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
</head>
<body>
<center>
<h1> : Show Ticket : </h1>
<br>
<form action="checkAvailablity" id="mainForm">
<!-- Ticket Id : <input type=number name="TicketID" id="tid" required>
<br>
<br>-->
Mobile Number : <input type="tel" pattern="[0-9]{10}" name="mobileNumber" placeholder="9876543210" required>
<br>
<br>
Movie Name : <select name="mname" required>
<option value="Screen-1 RRR">Screen-1 RRR</option>
<option value="Screen-2 Bahubali">Screen-2 Bahubali</option>
<option value="Screen-3 ThankGod">Screen-3 ThankGod</option>
<option value="Screen-4 Welcome">Screen-4 Welcome</option>
</select>
<br>
<br>
Show Date : <input type="date" name="sdate" id="showdate" required>
<br>
<br>
Show Time :<select name="sname" required>
<option value="Morning 10:00 AM">Morning 10:00 AM</option>
<option value="Noon 14:30 PM">Noon 14:30 PM</option>
<option value="Evening 18:00 PM">Evening 18:00 PM</option>
<option value="Night 22:00 PM">Night 22:00 PM</option>
</select>
<br>
<br>
Ticket Type :
<br>
<input type="radio" name="tType" value="Economic - Rs.150" required>Economic - Rs.150
<input type="radio" name="tType" value="Platinum - Rs.250" required>Platinum - Rs.250
<br>
<br>
Number of Tickets : <input type="number" name="nticket" min="1" max="400" placeholder="400" required>
<br>
<br>
<button type="submit">Check Availablity</button>
</form>
<br>
<br>
<form action="payment" style="display:none" id="payForm">
Payment Type :
<select name="PaymentType" id="pid" onclick="random()" required>
<option value="CASH">CASH</option>
<option value="CARD">CARD</option>
<option value="UPI">UPI</option>
</select>
<br>
<br>
Transaction Number : <input type="number" name="TrasactionId" id="tno" required>
<br>
<br>
<button type="submit">Book now</button>
</form>
</center>
<script>

function random()
{
	var pid = document.getElementById("pid").value;
    var tno = document.getElementById("tno");
    
    if(pid==="CASH")
    	{
    	tno.value=0;
    	}
    	else
    	{
    	tno.value=Math.floor(Math.random()*10000);
    	}
    	
}
if(${msg!=""})
	{
	alert('${msg}');
	message='${msg}';
	if(message.split(' ')[0]==="Tickets")
	{
	var payForm = document.getElementById("payForm");
	var mainForm = document.getElementById("mainForm");
	payForm.style.display="block";
	mainForm.style.display="none";
	}

	}
var today = new Date();
var dd = String(today.getDate()).padStart(2, '0');
var dd5 = String(today.getDate()+4).padStart(2, '0');
var mm = String(today.getMonth() + 1).padStart(2, '0');
var yyyy = today.getFullYear();
today = yyyy + '-' + mm + '-' + dd;
today5 = yyyy + '-' + mm + '-' + dd5;
$('#showdate').attr('min',today);
$('#showdate').attr('max',today5);
</script>
</body>
</html>