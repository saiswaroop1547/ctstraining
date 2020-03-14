import java.util.*;
class HashMap1
{
	public static int SumOfLowestMarks(HashMap<Integer,Integer>h1)
	{
	ArrayList<Integer> ar=new ArrayList<Integer>();
	int sum=0;
	Set keys=h1.keySet();
	Iterator iter=keys.iterator();
	while(iter.hasNext()) 
	
		{
		int mks=(int) iter.next();
		ar.add(h1.get(mks));
			
		}
	Collections.sort(ar);
	return sum=ar.get(0)+ar.get(1)+ar.get(2);
	}

	public static void main(String args[])
	{
		HashMap<Integer, Integer>h1=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 elements to be entered");
		for(int i=0;i<5;i++)
		{
			System.out.println("enter element");
			h1.put(sc.nextInt(), sc.nextInt());
		}
			System.out.println(SumOfLowestMarks(h1));
		
	}
	
}