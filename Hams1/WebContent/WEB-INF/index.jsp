<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<script type="text/javascript">  
function validate()
{
   var w=document.forms["myForm"]["patient_name"].value;
   var x=document.forms["myForm"]["clinic_detail"].value;
   //var y=document.forms["myForm"]["token_no"].value;
   var z=document.forms["myForm"]["time"].value;
   if (w.trim().length<=0) // check length of your name field
   {
      alert("Patient Name must be filled out");
      return false;
   }
   if (x.trim().length<=0) // check length of your name field
   {
      alert("clinic detail must be filled out");
      return false;
   }
   if (z.trim().length<=0) // check length of your name field
   {
      alert("Appointment time Name must be filled out");
      return false;
   }
   
}
</script> 
<style>
 p {
  white-space: pre;
 }
sup {
    vertical-align: super;
    font-size: smaller;
    color : red;
}

img {
	align:middle;
    height: 100px; 
    width: 100px;
}
</style> 

</head>

<body bgcolor='#E6E6FA'>
<img src = "images/HAMSLogo.jpg" alt="hamslogo" /> 
<div class="container">
<center>
<h1>HAMS</h1>




<form name="myForm" action="PatientAppointmentServlet" method="post"  onsubmit="return validate()" >

<p><b><font size=5>Clinic Appointment</font></b></p>
<p><font size=1><b><sup>*</sup></b> Required Fields</font></p>


<p>
	<b>Patient Name: <sup>*</sup></b> <input type="text" id="patient_name" name="patient_name"  size=50 maxlength=200 />
</p>

<p>
	<b>Clinic Detail: <sup>*</sup></b> <input type="text" id="clinic_detail" name="clinic_detail"  size=50 maxlength=200 />
</p>

<p>	
	<b>Approx Appointment Time: <sup>*</sup></b> <input type="text" id="time" name="time"  size=50 maxlength=200 />
</p>

	<input type="submit" name="submit" value="submit" />

</form>
</center>
</div>
</body>
</html>