package examples;

import java.io.IOException;
import java.net.InterfaceAddress;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RunnableInterfaceLamda
 */
@WebServlet("/RunnableInterfaceLamda")
public class RunnableInterfaceLamda extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     * 
     */
	  public interface Mathamatics
      {
   	   public int add(int a,int b);
      }
    public RunnableInterfaceLamda() {
        super();
        // TODO Auto-generated constructor stub
    }
    Mathamatics m=(a,b)-> a+b;
    {
    	
	System.out.println(m.add(10,20));
    }
    

     
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		// TODO Auto-generated method stub
	{
		
		//Mathamatics m=(a,b)-> a+b;
		//System.out.println(m.add(10,20));
		//Predicate<Integer> p= a->a%2!=0;
		//System.out.println(p.test(10));
		//Function<Integer,Double> f=r->3.14*r*r;
		//System.out.println(f.apply(4));
		BiFunction<Integer,Integer,Integer> big=(a,b)->{
			if(a>b)
				return a;
			else
				return b;
		};
		System.out.println(big.apply(10,20));
		
		//System.out.println("the area of the square is "+(x*x)+"square units");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
