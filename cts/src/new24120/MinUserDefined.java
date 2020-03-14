package new24120;

import java.util.ArrayList;

class NewProduct1
{
	int id;
	String name;
	double price;
	public NewProduct1(int id, String name, double price) {
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

public class MinUserDefined {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		NewProduct p1=new NewProduct(1,"Boat",6000);
		NewProduct p2=new NewProduct(2,"samsung",12000);
		NewProduct p3=new NewProduct(3,"Boat",9000);
		NewProduct p4=new NewProduct(4,"jabra",9000);
		NewProduct p5=new NewProduct(5,"sansui",9000);
		NewProduct p6=new NewProduct(6,"jabra",1000);
		NewProduct p7=new NewProduct(7,"jabra",12000);
		NewProduct p8=new NewProduct(8,"jabra",9200);
	ArrayList<NewProduct> products=new ArrayList<NewProduct>();
	products.add(p1);
	products.add(p2);
	products.add(p3);
	products.add(p4);
	products.add(p5);
	products.add(p6);
	products.add(p7);
	products.add(p8);
 NewProduct p=products.stream().filter(a->a.name.equals("jabra")).max((NewProduct a,NewProduct b)->a.price>b.price?1:-1).get();
 System.out.println(p);

	}

}
