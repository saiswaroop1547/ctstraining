package examples;

public class UserMainCode3 {
	
	public static boolean isPrime(int n)
	{boolean flag=true;
		for(int x=2;x<n;x++) {
		if(n%x==0)
			flag=true;
			else
		flag=false;
		}
		return flag;
	}

}
