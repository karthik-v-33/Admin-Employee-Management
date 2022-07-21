

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeLogin
 */
@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("l1");
		String b=request.getParameter("l2");
		if(a!=null && b!=null)
		{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employeereg where Email='"+a+"' and Password='"+b+"'");
			if(rs.next())
			{
				response.sendRedirect("EmployeeHome.jsp");
			}
			else
			{
				PrintWriter out=response .getWriter();
				out.println("insert mismatch");
			}
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		}
	}
}