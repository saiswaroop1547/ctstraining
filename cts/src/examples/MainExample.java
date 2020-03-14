package examples;

import java.util.*;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		TreeSet ts=new TreeSet();
		Queue pq=new PriorityQueue();
		ar.add(123);
		ar.add(46);
		ar.add(998);
		ar.add(669);
		ts.add(465);
		ts.add(810);
		ts.add(887);
		ts.add(336);
		pq.add(9985);
		pq.add(988555);
		pq.add(79955);
		pq.add(99128);
		
	HashMap h=new HashMap();
	h.put(1,ar );
	h.put(2,ts);
	h.put(3,pq);
	Set enteries=h.entrySet();
	Iterator itr1=enteries.iterator();
	while(itr1.hasNext())
	{
	 Map.Entry me=(Map.Entry)itr1.next();
	 Integer i=(Integer) me.getValue();
	}
	
	}

}
