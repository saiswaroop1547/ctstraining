package Settersexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion1 {

	public static void main(String[] args) {
		
		ApplicationContext c=new ClassPathXmlApplicationContext("QBXml1.xml");
		Question1 q1=(Question1) c.getBean("question1");
		q1.getAnswer();
	}

}
