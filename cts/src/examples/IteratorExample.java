package examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar=new ArrayList();
ar.add("Java");
ar.add(".NET");
ar.add("SELENIUM");
ar.add("ORACLE");
System.out.println(ar);
Iterator itr=ar.iterator();
while(itr.hasNext())
System.out.println(itr.next());

ListIterator litr=ar.listIterator();
while(litr.hasNext())
	System.out.println(litr.next());while(litr.hasPrevious())
System.out.println(litr.previous());
	}

}
