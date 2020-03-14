package EventHandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventhandler implements ApplicationListener<ContextStartedEvent>
{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) 
	{
		// TODO Auto-generated method stub
		System.out.println("Started");
	}
	
}
