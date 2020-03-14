package examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student4
{
	String name;
	int m1,m2;
	public Student4(String name, int m1, int m2) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
	}
	@Override
	public String toString() {
		return "Student4 [name=" + name + ", m1=" + m1 + ", m2=" + m2 + "]";
	}
	
	/*public String marks(Student4 st)
	{
		if(st.m2<45)
		{
			return st.name;
		}
		else {
			 return st.name;
		}
	}*/
	
}

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer,Student4> hm=new HashMap<Integer,Student4>();
hm.put(1001, new Student4("dinesh",77,46));
hm.put(1002, new Student4("venkat",99,41));
hm.put(1003, new Student4("hulash",77,45));
hm.put(1004, new Student4("dheeraj",66,44));
hm.put(1005, new Student4("gagan",66,14));

System.out.println(hm);
Set entries=hm.entrySet();
Iterator itr=entries.iterator();
System.out.println("the students are failed in their m2 examination");
while(itr.hasNext())
{Map.Entry me=(Entry)itr.next();
Student4 i=(Student4) me.getValue();
if(i.m2<=40)
	System.out.println(me.getKey()+" "+i.name);
}


		
	}

}
