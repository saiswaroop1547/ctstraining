package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQB {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("QBXml.xml");
		QuestionBank qb=(QuestionBank) context.getBean("qbank");
		qb.showAnswers();
	}

}
