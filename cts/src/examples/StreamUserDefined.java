package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class StreamUserDefined {

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
			.filter(p->p.price>7000)
			.map(p->p)
			.collect(Collectors.toList());
	long cnt=products.stream().filter(p->p.price>7000).count();
	System.out.println(cnt);
	list.forEach(System.out::println);
	}

}
