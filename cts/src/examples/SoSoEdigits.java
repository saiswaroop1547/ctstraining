package examples;

public class SoSoEdigits {
	public static int sumOfSquaresOfEvenDigits(int number)
	{
		int n1=0,n2=0;
		while(number!=0)
		{
			n1=number%10;
			if((n1%2)==0)
				n2+=n1*n1;
			number/=10;
		}
		return n2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
