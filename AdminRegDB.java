

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminRegDB
 */
@WebServlet("/AdminRegDB")
public class AdminRegDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String a=request.getParameter("r1");
		String b=request.getParameter("r2");
		String c=request.getParameter("r3");
		if(a!=null && b!=null && c!=null)
		{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","");
			Statement st=con.createStatement();
			st.executeUpdate("insert into adminreg values('"+a+"','"+b+"','"+c+"')");
			
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		response.sendRedirect("AdminLogin.jsp");	
		}
	}

}