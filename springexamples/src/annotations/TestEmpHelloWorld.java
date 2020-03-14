package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestEmpHelloWorld 
{
	public static void main(String args[])
	{
		ApplicationContext ap=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld hw=ap.getBean(HelloWorld.class);
		hw.setMessage("hi mam");
		hw.getMessage();
		hw.getWorld();
		Employee e=ap.getBean(Employee.class);
		e.getData();
	}
}
