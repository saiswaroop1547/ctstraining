import java.util.*;
public class TreeMapper {
	public static int Sumoflowestmarks(TreeMap tm)
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Set keys=tm.keySet();
		Iterator iter=keys.iterator();
		while(iter.hasNext()) 
		
			{
			int mks=(int) iter.next();
			int n=(int) tm.get(mks);
			ar.add(n);
			}
		return ar.get(0)+ar.get(1)+ar.get(2);
		}
public static void main(String args[])
{
	TreeMap tm=new TreeMap();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 5 elements");
	for(int i=0;i<5;i++)
	{
		System.out.println("enter element");
		tm.put(sc.nextInt(),sc.nextInt());
	}
	System.out.println(Sumoflowestmarks(tm));
}
}
