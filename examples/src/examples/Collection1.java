package examples;
import java.util.TreeSet;

public class Collection1 {
public static void main(String args[])
{
Student1 s1=new Student1("swaroop","28","hyderabad");
Student1 s2=new Student1("gagan","24","Hyderabad");
Student1 s3=new Student1("siva","29","hyderabad");
TreeSet<Student1> t=new TreeSet<Student1>();
t.add(s1);
t.add(s2);
t.add(s3);
System.out.println(t);
}
}
