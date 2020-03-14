package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the no of entries");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{	System.out.println("enetr the year");
			Integer year=sc.nextInt();
			System.out.println("enetr the no of admissions");
			Integer admissions=sc.nextInt();
			hm.put(year, admissions);
}
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		int max=0;
		int tyear=0,str=0;
		while(itr.hasNext())
		{Map.Entry me=(Entry)itr.next();
		  str= (Integer) me.getValue();
		 if(str>max)
		 {
			 max=str;
			tyear=(int) me.getKey();
		 }

		}System.out.println("maximum admissions are");
		System.out.println(tyear+" "+max);
}
}