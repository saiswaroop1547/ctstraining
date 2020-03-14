package examples;
import java.util.Scanner;

public class NumberValidation {
	public static int validateNumber(String input)
	{
		int b=0;
		if(input.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
		{
			b=1;
		}
		else 
			b=-1;
		return b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.next();
NumberValidation obj=new NumberValidation();
System.out.println(obj.validateNumber(str));

	}
}

