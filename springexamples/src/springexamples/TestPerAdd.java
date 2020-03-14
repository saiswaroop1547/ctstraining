package springexamples;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerAdd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("personAddressBean.xml");
		Person p=(Person) context.getBean("per");
		p.showData();
		Address a=(Address) context.getBean("addr");
		System.out.println(a);
	}

}
