package EventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("bean1.xml");
		cap.start();
		HelloWorld hello=(HelloWorld) cap.getBean("helloworld");
		
		hello.getMessage();
		hello.getWorld();
		cap.refresh();
		cap.stop();
	}

}
