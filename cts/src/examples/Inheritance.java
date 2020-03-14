package examples;

public class Inheritance {
int area,length,breadth;
static{
	System.out.println("static blopck of base class");
}
Inheritance()
{
length=2;
breadth=4;
}
public void calArea()
{
	area=length*breadth;
	System.out.println("the area is :"+area);
}
{
	System.out.println("non static block of base class");
}
}

class Inheritance1 extends Inheritance
{
	int height=9,vol;
	static
	{
		System.out.println("static block of derived class ");
	}
	Inheritance1()
	{
		System.out.println("inside the inheritance 1 class");
	}
	public void calVol()
	{
		vol=area*height;
		System.out.println("the vol is: "+vol);
	}
	{
		System.out.println("non static block of derived class ");
	}
}