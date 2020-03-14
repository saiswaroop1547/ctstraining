package new25120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferExample 

{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStreamReader inp=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(inp);
try
{
	System.out.println("enter ur name");
	String name=br.readLine();
	System.out.println("enter ur city");
	String city=br.readLine();
	System.out.println("name is " +name);
	System.out.println("city is " +city);
}
finally
{
	
}
	}

}
