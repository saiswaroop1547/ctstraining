package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap hm=new HashMap();
			Object rest=hm.put("k1", "India");
			hm.put("k1", "INDIA");
			hm.put("k2", "JAPAN");
			hm.put("k3", "CHINA");
			hm.put("k4", "MALYSIA");
			System.out.println(hm);
			Object obj=hm.putIfAbsent("k1", "Canada");
			//System.out.println(rest);
			Object r=hm.remove("k2");
			System.out.println(r);
			System.out.println(hm);
			Set keys=hm.keySet();
		System.out.println(keys);
			Iterator itr=keys.iterator();	
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	Set enteries=hm.entrySet();
	Iterator itr1=enteries.iterator();
	while(itr1.hasNext())
	{
		Map.Entry me=(Map.Entry)itr1.next();
				System.out.println(me.getKey()+"   "+me.getValue());
	}
	
	}
}
