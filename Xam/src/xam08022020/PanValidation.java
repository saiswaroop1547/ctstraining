package xam08022020;

public class PanValidation 
{
		public static void PANNumber(String s1) 
		{       
			if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))        
	
			{        
					System.out.println("VALID");       
			}       
					else
					{
							System.out.println("NOT VALID");
					}
		}
}