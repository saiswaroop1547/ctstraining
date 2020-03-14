package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Tennies 
{
	private FortuneService fortuneService;
	@Autowired
	public Tennies(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	public String getData()
	{
		return "hi how r u";
	}
	public String getDetails()
	{
		return fortuneService.getFortune();
	}
}
