package examples;
import java.util.Scanner;

public class TestVoting {

	public TestVoting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter ur age");
age=sc.nextInt();
Voting vote=new Voting();
try {
	vote.testAge(age);
}
catch(InvalidAgeException e)
{
	System.out.println(e);
}
catch(InsufficientAgeException e)
{
	System.out.println(e);
}
	}

}