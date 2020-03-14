package new25120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentmarksBuffer 
{

	public static void main(String[] args) throws IOException
	
	{
		// TODO Auto-generated method stub
		try(InputStreamReader inp=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(inp))
		{
			System.out.println("enter m1 marks");
			int m1=Integer.parseInt(br.readLine());
			System.out.println("enter m2 marks");
			int m2=Integer.parseInt(br.readLine());
			System.out.println("enter m3 marks");
			int m3=Integer.parseInt(br.readLine());
			int sum=m1+m2+m3;
			System.out.println("sum is : " +sum);
			int Avg=(m1+m2+m3)/3;
			System.out.println("average is : " +Avg);

		}
	}

}
