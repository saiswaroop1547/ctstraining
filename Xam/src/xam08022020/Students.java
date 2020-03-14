package xam08022020;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import xam08022020.Student;

public class Students {
public static void main(String[] args) 
{
ArrayList<Student> ar=new ArrayList<Student>();
Student s1=new Student("swaroop",44);
Student s2=new Student("siva",88);
Student s3=new Student("chaithanya",66);
Student s4=new Student("Vinay", 99);
ar.add(s1);
ar.add(s2);
ar.add(s3);
ar.add(s4);
Predicate<Student> p=s->s.marks>=50;

Function<Student,String> f=s->
{
	int marks=s.marks;
	if(marks>=80) 
	{
		return "Distinction";
	}
	else if(marks>=60&&marks<=79)
	{
		return "First Class";
	}
	else if(marks>=50&&marks<=59)
	{
		return "Second Class";
	}
	else
	{
		return "Failed";
	}
};

			Consumer<Student> c=s->
			{
				System.out.println("Student name" +s.name);
				System.out.println("Student marks" +s.marks);
				System.out.println("Student grade" +f.apply(s));
			};
			for(Student s:ar)
			{
			if(p.test(s))
			c.accept(s);
			}
	}
}
