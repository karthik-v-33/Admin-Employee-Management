

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
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select * from employeereg");
		while(rs.next())
		{
			out.println(rs.getString(1));
		}
		
	}
	catch(Exception e)
	{
	System.out.println(e);	
	}
	response.sendRedirect("AdminHome.jsp");	
	}
}

