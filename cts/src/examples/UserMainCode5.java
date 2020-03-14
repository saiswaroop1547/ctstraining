package examples;
public class UserMainCode5 
{
public static int searchElement(int arr[],int x)
{
	boolean found=false;
	int l=0,h=arr.length-1,mid=(l+h)/2;
	while(l<=h) {
		if(arr[mid]==x)
		{
			found=true;
			break;
		}
		else if(arr[mid]<x)
		{
			l=mid+1;
		}
		else if(arr[mid]>x) {
			h=mid-1;
}
		mid=(l+h)/2;
}
	if(found)
		return 1;
	else
		return 0;
}
}
