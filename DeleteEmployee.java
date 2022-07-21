

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/DeleteEmployee")
public class DeleteEmployee extends HttpServlet {
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {	
	String a=request.getParameter("n1");

	
	if(a!=null)
	{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","");
		Statement st=con.createStatement();
		st.executeUpdate("delete from employeereg where Email='"+a+"'");
		
	}
	catch(Exception e1)
	{
	System.out.println(e1);	
	}
	response.sendRedirect("AdminHome.jsp");	
	}
}

}