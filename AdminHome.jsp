<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Admin Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<style>
.w3-btn {
	margin-bottom:10px;
}

</style>
<body>
<br><br><br><br>
<div class="w3-container">
<h2 style="text-align: center; font-weight:bold;">ADMIN HOME</h2>
<hr>
<br>
  <a href="EmployeeReg.jsp"><button class="w3-btn w3-green w3-border  w3-round-large" style="position:relative; left:840px;">Insect</button></a>

  <a href="UpdateEmployeeInfo.jsp"><button class="w3-btn w3-yellow w3-border  w3-round-large" style="position:relative; left:840px;">Update</button></a>
<br><br>
<form action="DeleteEmployee" method="post">
  <input type="text" placeholder="Enter Email" name="n1" style="position:relative; left:810px; bottom:2pt; padding:13px;">
  <br>
<button class="w3-btn w3-red w3-border  w3-round-large" style="position:relative; left:880px;">Delete</button>
</form>
  <br>
<a href="Showinfo"><button class="w3-btn w3-red w3-border  w3-round-large" style="position:relative; left:100px;">Show Info</button></a>

</body>
</html>
