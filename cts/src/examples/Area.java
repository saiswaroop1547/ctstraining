package examples;
public class Area {
	void area(float x)
	{
		System.out.println("the area of the square is "+(x*x)+"square units");
	}
	void area(float x,float y)
	{
		System.out.println("area of the rectangle is "+(y*x)+"square units");
	}
	void area(float x,float y,float z)
	{
		System.out.println("perimeter of the traingle is "+(x+y+z)+"square units");
	}
	void area(float x,float y,float z,float m)
	{
		float s = (x + y + z + m) / 2;
			System.out.println("Area of the quadrilateral " +Math.sqrt((s-x)*(s-y)*(s-z)*(s-m)));
	}
}
