package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationComponent.xml");
		Tennies tn=ap.getBean(Tennies.class);
		System.out.println(tn.getData());
		System.out.println(tn.getDetails());
		
	
	
	}

}
