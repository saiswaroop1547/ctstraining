package examples;
import java.io.*;
public class Throws {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first value");
		int first=(int)br.read();
		System.out.println("the value is:"+first);
	}

}
