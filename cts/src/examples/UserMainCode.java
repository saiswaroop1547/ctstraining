package examples;

public class UserMainCode {

	public static int checkSum(int n)
		{
			int sum=0;
			while(n!=0)
			{
			sum=sum+n%10;
			n=n/10;
			}
			if(sum%2==0)
			return -1;
			else 
			return 1;
			
		}
	}
