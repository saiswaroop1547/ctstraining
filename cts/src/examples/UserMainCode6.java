package examples;

public class UserMainCode6 
{
	public static int Arrays(int arr1[],int arr2[])
	{
		int i,j,n1,n2,sum=0;
		n1=arr1.length;
		n2=arr2.length;
		for(i=0;i<n1;i++) {
			for(j=0;j<n2;j++) {
				if(arr1[i]==arr2[j])
				{
					sum=sum+arr1[i];
				}
					
			
			}
	}
		return sum;
	}
}
