package new24120;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUserDefined {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewProduct1 p1=new NewProduct1(1,"Boat",6000);
		NewProduct1 p2=new NewProduct1(2,"samsung",12000);
		NewProduct1 p3=new NewProduct1(3,"jabra",9000);
	ArrayList<NewProduct1> products=new ArrayList<NewProduct1>();
	products.add(p1);
	products.add(p2);
	products.add(p3);
	List<NewProduct1> list=products.stream()
	.sorted((a,b)->a.name.compareTo(b.name)).collect(Collectors.toList());
	//.forEach(System.out::println);
	
}
}
