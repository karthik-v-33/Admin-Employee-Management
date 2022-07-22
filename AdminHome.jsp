<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*" %>
<%@ page import=" java.sql.*"%>

<!DOCTYPE html>
<html>
<title>Admin Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script src="https://kit.fontawesome.com/919b33c3bd.js" crossorigin="anonymous"></script>

<style>
.w3-btn {
	margin-bottom:10px;
}

</style>
<body>
<br><br><br><br>
<div class="w3-container">
<h2 style="text-align: center; font-weight:bold;">ADMIN HOME <i class="fa fa-home"></i></h2>
<hr>
<br>
  <a href="EmployeeReg.jsp"><button class="w3-btn w3-green w3-border  w3-round-large" style="position:relative; left:840px;">Insert <i class="fa fa-download" aria-hidden="true"></i></button></a>

  <a href="UpdateEmployeeInfo.jsp"><button class="w3-btn w3-yellow w3-border  w3-round-large" style="position:relative; left:840px;">Update <i class="fa fa-cloud"></i></button></a>
 <br>
 <form action="ShowInfo" method="post">
 <button class="w3-btn w3-blue w3-border  w3-round-large" style="position:relative; left:800px;">Employee Registration Details <i class="fa fa-user"></i></button>
  </form>
  <br>
<form action="#" method="post">
  <input type="text" placeholder="Enter Email" name="n1" style="position:relative; left:810px; bottom:2pt; padding:13px;">

<button class="w3-btn w3-red w3-border  w3-round-large" style="position:relative; left:810px;">Delete <i class="fa fa-trash"></i></button>
</form>
  <br>

<% 
try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","");
		Statement st=con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from employeereg");  
             out.println("<table border=1 width=100% height=10% text-algin=center>");  
             out.println("<tr><th>First_Name</th><th>Last_Name</th><th>Position</th><th>Qualification</th><th>City</th><th>Birth</th><th>Email</th><th>Phone</th><th>Address</th><th>Password</th><tr>");  
             while (rs.next()) 
             {  
                 String a = rs.getString("First_Name");  
                 String b = rs.getString("Last_Name");  
                 String c = rs.getString("Position");
                 String d = rs.getString("Qualification");
                 String e = rs.getString("City");
                 String f = rs.getString("Birth");
                 String g = rs.getString("Email");
                 String h = rs.getString("Phone");
                 String i = rs.getString("Address");
                 String j = rs.getString("Password");
                 out.println("<tr><td>" + a + "</td><td>" + b + "</td><td>" + c + "</td><td>" + d + "</td><td>" + e + "</td><td>" + f + "</td><td>" + g + "</td><td>" + h + "</td><td>" + i + "</td><td>" + j + "</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             con.close();  
	}
	catch(Exception e1)
	{
	System.out.println(e1);	
	}
%>


</body>
</html>
