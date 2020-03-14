package examples;
import java.util.function.*;
public class BifunctionalStudent {
	public static void main(String[] args) 
	{
BiFunction<String,String,Student112> bi=(htno,name)->new Student112(htno,name);
Student112 obj=new Student112("1556","japan");
Student112 obj1=new Student112("1995","tokyo");
System.out.println(obj);
System.out.println(obj1);
BiConsumer<String,String> c1=(a,b)->System.out.println(a+b);
}

}
