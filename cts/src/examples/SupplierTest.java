package examples;
import java.util.function.Supplier;

public class SupplierTest {
public static void main(String artgs[])
{
	Supplier<String> s=()->
	{
		String[] str= {"hari","swaroop","minni","jinni"};
		int x=(int)(Math.random()*4);
		return str[x];
	};
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
}
}
