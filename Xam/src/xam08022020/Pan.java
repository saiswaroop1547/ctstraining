package xam08022020;

import java.util.Scanner;

public class Pan 
{
	public static void main(String args[])
	{
	             
			Scanner sc=new Scanner(System.in);   
			System.out.println("Enter ur PAN number");
            String s=sc.nextLine();        
			PanValidation.PANNumber(s);       
	} 
}
