package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestPersons {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AbstractApplicationContext factory=new ClassPathXmlApplicationContext
				("personsBean.xml");
		Persons obj=(Persons)factory.getBean("person");

	obj.showData();	
	factory.registerShutdownHook();
	}

}
