package examples;
import java.util.*;
public class DequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue d=new PriorityQueue();
PriorityQueue<Student112> d1=new PriorityQueue<Student112>();
Student112 s1=new Student112("1556", "vinni");
Student112 s2=new Student112("1886", "vinnu");
Student112 s3=new Student112("1994", "baby");

d1.add(s1);
d1.add(s2);
d1.add(s3);
System.out.println(d1);
d1.remove();
System.out.println(d1);

/*d.add(10);
d.add(20);
d.add(56);
d.add(62);
d.add(33);
System.out.println(d);
d.remove();
System.out.println("After removal " +d);
d.add(63);
d.add(62);
System.out.println(d);
d.remove();
System.out.println("After removal " +d);
d.remove();
System.out.println(d);*/
	}

}
