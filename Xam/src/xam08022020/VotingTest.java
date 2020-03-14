package xam08022020;

import java.util.Scanner;

import xam08022020.InsufficientAgeException;
import xam08022020.InvalidAgeException;

public class VotingTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter ur age");
int age=sc.nextInt();
VotingValidation vote=new VotingValidation();
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