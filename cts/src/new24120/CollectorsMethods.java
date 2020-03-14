package new24120;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsMethods 

{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		List<Double> p=p.stream().map(x->x.price).collect(Collectors.toList());
	
	Set<Double> p1=p.stream().map(x->x.price).collect(Collectors.toSet());
	
	Double sumPrices=p.stream().collect(Collectors.summingDouble(x->x.price));
	
	Integer sumId =p.stream().collect(Collectors.summingInt(x->x.price));
	Double average=p.stream().collect(Collectors.averagingDouble(x->x.price));
	Long noOfElements=p.stream().collect(Collectors.counting());
	
	}

}
