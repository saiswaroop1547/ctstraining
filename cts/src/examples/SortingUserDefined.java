package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUserDefined {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1,"Boat",6000);
		Product p2=new Product(2,"samsung",12000);
		Product p3=new Product(3,"jabra",9000);
	ArrayList<Product> products=new ArrayList<Product>();
	products.add(p1);
	products.add(p2);
	products.add(p3);
	List<Product> list=products.stream()
	.sorted((a,b)->a.name.compareTo(b.name)).collect(Collectors.toList());
	//.forEach(System.out::println);
	
}
}
