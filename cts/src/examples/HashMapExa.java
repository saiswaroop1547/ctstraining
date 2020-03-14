package examples;

import java.util.*;
import java.util.Map.Entry;

public class HashMapExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
HashMap<String,String> m=new HashMap<String,String>();
m.put("1998", "SaI");
m.put("1981", "LakshMi");
m.put("1972", "srinivasaraO");
m.put("1984", "ramaraO");
m.put("2001", "lohithA");

Set entries=m.entrySet();
Iterator itr=entries.iterator();
System.out.println();
while(itr.hasNext())
{Map.Entry me=(Entry)itr.next();
 String str= (String) me.getValue();
if(str.charAt(0)>=97 && str.charAt(0)<=122 && str.charAt(str.length()-1)>=65 && str.charAt(str.length()-1)<=90)
	{ar.add(str);
}
}
System.out.println("the names are");
for(String c:ar)
	System.out.println(c);
	}

	
}
