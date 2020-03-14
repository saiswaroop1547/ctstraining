package examples;

class A{
	int z;
	A(int x)
	{
		z=x;
		System.out.println(z);
	}
}

public class B1 extends A{

	B1(int n) {
		super(10);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B1 b = new B1(20);

	}

}
