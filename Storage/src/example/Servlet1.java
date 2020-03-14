package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name=request.getParameter("name");
			String department=request.getParameter("dept");
			String designation=request.getParameter("desg");
			String company=(String)request.getAttribute("company");
			String mobilenumber=(String)request.getAttribute("mobilenumber");
			String email=(String)request.getAttribute("email");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			out.println("<h3>I am from servlet1</h3>");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			PreparedStatement pst=con.prepareStatement("insert into empdetails values(?,?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, department);
			pst.setString(3, designation);
			pst.setString(4, company);
			pst.setString(5, mobilenumber);
			pst.setString(6, email);
			int i=pst.executeUpdate();
			if(i==1) {
			response.sendRedirect("http://localhost:8081/Storage/sucess.html");
			}
			else {
				out.println("unsucessful");
			}
			con.close();
			out.close();
			
		}
		catch(Exception e)
		{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
