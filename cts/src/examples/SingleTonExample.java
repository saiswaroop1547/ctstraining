package examples;

public class SingleTonExample {
	private static final SingleTonExample ste = new SingleTonExample();
	private SingleTonExample()
	{
		System.out.println("Inside the constructor method");
	}
	public static SingleTonExample getInstance()
	{
		return null;
		
	}
}
