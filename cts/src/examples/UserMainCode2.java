package examples;

public class UserMainCode2 
{
public static String findRoots(int a,int b,int c)
{

	
	int desc = (b*b)-(4*a*c);
	if(desc>0)
		
		return"roots are real and unequal";
	else if(desc==0)
		return"roots are real and equal";
		
	else
		return"roots are imaginary";
	
}
}
