package new24120;

import java.util.ArrayList;
class NewProduct
{
	int id;
	String name;
	double price;
	public NewProduct(int id, String name, double price) {
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

public class MaxUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewProduct p1=new NewProduct(1,"Boat",6000);
		NewProduct p2=new NewProduct(2,"samsung",12000);
		NewProduct p3=new NewProduct(3,"jabra",9000);
	ArrayList<NewProduct> products=new ArrayList<NewProduct>();
	products.add(p1);
	products.add(p2);
	products.add(p3);
 NewProduct p=products.stream().min((NewProduct a,NewProduct b)->a.price<b.price?-1:1).get();
 System.out.println(p);
	}

}
