package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring 
{
	public static void main(String args[])
	{
		//ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext factory=new ClassPathXmlApplicationContext("bean.xml");
		//HelloWorld obj=(HelloWorld) factory.getBean("helloworld");
		//Employee e=(Employee)factory.getBean("emp");
		//obj.getMessage();
		//obj.display();
		//e.display();
		Student s1=(Student)factory.getBean("ts");
		s1.setHtno("15471a");
		s1.setName("swaroop");
		s1.getMsg();
		
		Student s2=(Student)factory.getBean("ts");
		s2.setHtno("1547");
		s2.setName("sam");
		s2.getMsg();
	}
	
}
