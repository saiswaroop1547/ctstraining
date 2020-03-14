package examples;

import java.util.*;

class Cdept
{
	String d1;
	String d2;
	String d3;
	public Cdept(String d1, String d2, String d3) {
		super();
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	@Override
	public String toString() {
		return "Cdept [d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}
	
}

public class HashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Cdept> hm=new HashMap<String,Cdept>();
		hm.put("JNTUK",new Cdept("cse","mec","civ"));
		hm.put("JNTUH",new Cdept("it","ece","eee"));
		hm.put("JNTUA",new Cdept("ece","mec","eee"));
		hm.put("JNTUN",new Cdept("eee","mec","civ"));
		hm.put("JNTUS",new Cdept("civ","mec","eee"));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the course");
		String s=sc.next();
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		System.out.println("the courses offered by this group is");
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry) itr.next();
			Cdept d=(Cdept) m.getValue();
			if(d.d1.equals(s)||d.d2.equals(s)||d.d3.equals(s))
			System.out.println(m.getKey());//+""+d.getValue());
			
		}
	}

}

