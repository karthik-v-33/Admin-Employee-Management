

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ShowInfo
 */
@WebServlet("/ShowInfo")
public class ShowInfo extends HttpServlet {
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {	
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	 out.println("<h1 >EMPLOYEE REGISTRATION DETAILS</h1>");
	 out.println("<br>");
	 out.println("<br>");
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
	
	  }
}

