package examples;
import java.util.*;

public class ArrayListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ArrayList ar1=new ArrayList();
ar.add("blue");
ar.add("red");
ar.add("green");
ar.add("yellow");
ar.add("violet");
ar.add("safron");
ar.add("magenta");
ar.add("powdered-blue");
ar.add("white");
System.out.println(ar);
List ar2=ar.subList(0,4);
System.out.println(ar2);
ar1.add("raitha");
ar1.add("sharwa");
ar1.add("kaliya");
ar1.add("chicken");
ar1.add("mutton");
ar.addAll(ar1);
System.out.println(ar);

ar.set(8,"fish");
System.out.println(ar);
/*Iterator ir=ar.iterator();
while(ir.hasNext())
System.out.println(ir.next());*/
//ar.add(0,"biscuit");
//System.out.println(ar);
//System.out.println(ar.get(6));
//ar.set(2,"darkgreen");
//System.out.println(ar);
//ar.remove(5);
//System.out.println(ar);
for(int i=0;i<ar.size();i++)
	System.out.println(ar.get(i));

//System.out.println(ar.contains("white"));
/*int i=ar.indexOf("white");
if(i==-1) 
	System.out.println("sorry");
else
	System.out.println(i);
	
Collections.sort(ar);
System.out.println(ar);*/




	}

}
