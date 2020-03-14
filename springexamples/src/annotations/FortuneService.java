package annotations;

import org.springframework.stereotype.Component;

@Component
public class FortuneService
{
	public String getFortune()
	{
		return "miss u";
	}
}
