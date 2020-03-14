package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiidenServlet
 */
@WebServlet("/HiidenServlet")
public class HiidenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HiidenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String n=request.getParameter("uname");
		pw.println("hello"+n);
		pw.print("<html><body>");
		pw.print("<form action='SecondServlet'>");
		pw.print("<input type='hidden' name='uname' value='"+n+"'>");
		pw.print("<input type='submit' value='go'>");
		pw.print("</form>");
		pw.print("</body></html>");
		pw.close();
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
