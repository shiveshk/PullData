<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" type="text/css" href="hams.css">

<meta charset="utf-8">
<title>Page Title</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
</head>
<body>
<img src = "images/HAMSLogo.jpg" alt="hamslogo" id="img1" style=" margin-left: 45px; "/>

<center>

<div id="login-overlay" class="modal-dialog"  style="width:800px;">
     <div class="modal-content" id="modal-content" >
          <div class="modal-header" >
				<h1>HAMS</h1>
					<p><b><font size=5>Clinic Registration Form</font></b></p>
					<p><font size=1><b><sup>*</sup></b> Required Fields</font></p>
<form name="myForm" action="DoctorRegistrationServlet" method="post" >
 	<div class="form-group">
<table >
 <tbody>
 	
 	 <tr class="row1">
	 	 <td><b>Clinic Name: <sup>*</sup></b> </td>
	 	 <td><input type="text" id="clinic_name" name="clinic_name"  size=50 maxlength=5000  placeholder="clinic_name" title="Please enter your Clinic Name" required/></td>
	 </tr>
 	
	 <tr class="row2">
	 	 <td><b>Clinic Address: <sup>*</sup></b> </td>
	 	 <td><input type="text" id="address" name="address"  size=50 maxlength=5000 placeholder="clinic_address" title="Please enter Clinic Address" required/></td>
	 </tr> 
	 
	 <tr class="row3"> 
	 	<td><b>Contact number: <sup>*</sup></b> </td>
	 	<td><input type="text" id="contact_number" name="contact_number"  size=50 maxlength=5000  placeholder="contact_number" title="Please enter Contact Number" required/></td>
	 </tr> 
	 
	 <tr class="row4"> 
	 	<td style="padding-right: 10px"><b>email: <sup>*</sup></b> </td> 
	 	<td><input type="text" id="email" name="email"  size=50 maxlength=5000 placeholder="email" title="Please enter email" required/></td> 
	 </tr>
	 
	 <tr class="row5"> 
	 	<td style="padding-right: 10px"><b>Authorised Doctor Name: <sup>*</sup></b> </td> 
	 	<td><input type="text" id="authorised_doctor_name" name="authorised_doctor_name"   placeholder="authorised_doctor_name" title="Please enter Authorised Doctor Name" required ></td> 
	 </tr>
	 
	 <tr class="row6"> 
	 	<td style="padding-right: 10px"><b>Payment Cycle: <sup>*</sup></b> </td> 
	 	<td><input type="text" id="payment_cycle" name="payment_cycle"   placeholder="payment_cycle" title="Please enter Payment Cycle" required ></td> 
	 </tr>
	 
	 <tr class="row7"> 
	 	<td style="padding-right: 10px"><b>Agreement Mode: <sup>*</sup></b> </td> 
	 	<td><input type="text" id="agreement_mode" name="agreement_mode"   placeholder="agreement_mode" title="Please enter Agreement Mode" required ></td> 
	 </tr>
	 
	 <tr class="row8"> 
	 	<td style="padding-right: 10px"><b>Price Quota: <sup>*</sup></b> </td> 
	 	<td><input type="text" id="price_quota" name="price_quota"   placeholder="price_quota" title="Please enter Price Quota" required ></td> 
	 </tr>
	 
	 <tr class="row9"> 
	 	<td style="padding-right: 10px"><b>Agreement Date <sup>*</sup></b> </td> 
	 	<td><input type="date" id="agreement_date" name="agreement_date"   placeholder="agreement_date" title="Please enter Agreement Date" required ></td> 
	 </tr>
	 
	 
 </tbody>	 
	  
</table> 
	<br /><input type="submit" name="submit" value="submit" />
	</div>
</form>
		</div>
	</div>
</div>

</center>
</body>
</html>