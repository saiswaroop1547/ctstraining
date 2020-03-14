package examples;

import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.addElement("INDIA");
		v.add("CHINA");
		v.add("ASIA");
		System.out.println(v);
		v.insertElementAt("AMERICA",2);
		System.out.println(v);
		v.remove(2);
		v.removeElementAt(2);
		System.out.println(v);
		
		Stack s=new Stack();
		s.push("java");
		s.push("lanaguage");
		s.push("laguage");
		System.out.println(s);
		String temp=(String) s.pop();
		System.out.println(temp);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		int i=s.search("java");
		if(i>=0)
			System.out.println("element is found");
		else
			System.out.println("element found");
	}

}
