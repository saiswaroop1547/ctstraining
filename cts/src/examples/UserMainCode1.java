package examples;

public class UserMainCode1 
{
public static int countVowels(String str)
{
	int i, X = str.length(),count=0;
	for(i=0;i<X;i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
		count++;	
		}
	}
	return count;
	
}

}
