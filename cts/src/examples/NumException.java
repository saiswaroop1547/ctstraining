package examples;

public class NumException extends Exception {

	public NumException() {
		// TODO Auto-generated constructor stub
	}
	public void testString(String str)throws NumberException{
		int x=Integer.parseInt(str);
		if(x==x)
		{	System.out.println("you are eligible for voting...");
		System.out.println(x*x);
		
	}
		else
			throw new NumberException();
}
}
