package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTenniesCoach {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationComponent.xml");
		TenniesCoach tc=ctx.getBean(TenniesCoach.class);
		FootBallCoach fcoach=ctx.getBean(FootBallCoach.class);
		fcoach.getFoot();
		System.out.println(tc.getDailyWorkout());
	}

}
