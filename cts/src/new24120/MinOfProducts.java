package new24120;

import java.util.ArrayList;
import java.util.stream.Collectors;


class Products
{
	String name;
	double price;
	public Products(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "products [name=" + name + ", price=" + price + "]";
	}
	
}
public class MinOfProducts {

	public static void main(String[] args) {
		
		
		ArrayList<Products> products=new ArrayList<Products>();
		
		products.add(new Products("Apple",20000));
		products.add(new Products("Apple",12000));
		products.add(new Products("skullcandy",29000));
		products.add(new Products("Bose",21000));
		products.add(new Products("Bose",25000));
		products.add(new Products("lenova",24000));
		products.add(new Products("samsung",23000));
		
		Double sqr=products.stream().collect(Collectors.averagingDouble(x->x.price));		
		System.out.println(sqr);
		// TODO Auto-generated method stub

	}

}
