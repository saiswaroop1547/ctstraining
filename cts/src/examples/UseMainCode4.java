package examples;

public class UseMainCode4 
{
public static int findELement(int arr[],int x)
{
	boolean found=false;
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]==x)
	{
		found=true;
	}
	}
if(found)
return 1;
else
	return 0;
}
}
