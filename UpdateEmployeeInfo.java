

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateEmployeeInfo
 */
@WebServlet("/UpdateEmployeeInfo")
public class UpdateEmployeeInfo extends HttpServlet {
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {	
	String a=request.getParameter("r1");
	String b=request.getParameter("r2");
	String c=request.getParameter("r3");
	String d=request.getParameter("r4");
	String e=request.getParameter("r5");
	String f=request.getParameter("r6");
	String g=request.getParameter("r7");
	String h=request.getParameter("r8");
	String i=request.getParameter("r9");
	String j=request.getParameter("r10");
	
	if(a!=null && b!=null && c!=null && d!=null && e!=null && f!=null && g!=null && h!=null && i!=null && j!=null)
	{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","");
		Statement st=con.createStatement();
		st.executeUpdate("update employeereg set First_Name='"+a+"',Last_Name='"+b+"',Position='"+c+"',Qualification='"+d+"',City='"+e+"',Birth='"+f+"',Phone='"+h+"',Address='"+i+"',Password='"+j+"' where Email='"+g+"'");
		
	}
	catch(Exception e1)
	{
	System.out.println(e1);	
	}
	response.sendRedirect("AdminHome.jsp");	
	}
}

}