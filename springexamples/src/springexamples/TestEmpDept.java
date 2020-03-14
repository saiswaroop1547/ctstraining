package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpDept {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext
				("EmpDept.xml");
		Employee1 e=(Employee1) ap.getBean("Employee");
		System.out.println(e.getFullName());
		System.out.println(e.getDepartmentBean().getName());
	
	
	}

}
