package examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
public class ArraylistPrg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int max=0,total=0;
		String topper=null;
		ArrayList ar=new ArrayList();
		System.out.println("enter no of students");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			ar.add(sc.next());
	}
		System.out.println(ar);
		Iterator itr=ar.iterator();
		while(itr.hasNext()) {
			String temp=(String)itr.next();
			StringTokenizer stk=new StringTokenizer(temp,"-");
			String name=stk.nextToken();
				int m1=Integer.parseInt(stk.nextToken());
				int m2=Integer.parseInt(stk.nextToken());
				int m3=Integer.parseInt(stk.nextToken());
			total=m1+m2+m3;
		if(total>max)
		{
			max=total;
			topper=name;
		}
		}
		System.out.println("topper is :"+topper);
	}

}
