import java.util.*;

class UserMainCode {

public static Map increaseSalaries(int n,HashMap
		<Integer,String> h1,HashMap<Integer,Integer> h2)
{
	HashMap<Integer, Integer> op=new HashMap<Integer,Integer>();
Set keys=h1.keySet();
Iterator iter=keys.iterator();
while(iter.hasNext())
{
 int id = (int)iter.next();
String s=h1.get(id);
if(s.equals("manager"))
{
	int newsal=h2.get(id)+5000;
	op.put(id,newsal);
}	
}
return op;
}
}
