package Settersexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterPerson {

	public static void main(String[] args) 
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("setterperson.xml");
		Person p=(Person) ap.getBean("setterpersons");
		p.showData();
	}

}
