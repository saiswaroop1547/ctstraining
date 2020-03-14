package examples;

public class InvalidAgeException extends Exception {
	
	public InvalidAgeException()
	{
		super("age cannot be -ve or more than 100");
	}

}
