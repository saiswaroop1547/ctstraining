package examples;
import java.util.function.Function;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Function<String,Integer> f=s->s.length();
System.out.println("theblength of the string is : "+f.apply("India"));
Function<Integer,Integer> f2=n->n*n;
System.out.println("square of a number is :"+f2.apply(6));
Function<String,Integer> v=s->
{int count=0;
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		count++;
}
return count;
};
System.out.println("no of vowels in the given string is " +v.apply("apple"));
Function<Integer,Integer> fact=x->{
	int f1=1;
	for(int i=2;i<=x;i++)
		f1=f1*i;
	return f1;
};
System.out.println("factorial of a given number is " +fact.apply(5));
Function<String,Integer> vcount=s->
{int count=0;
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)==' ')
	{
		continue;
	}
	else
		count++;
}
return count;
};
System.out.println("no of characters in the given string " +vcount.apply("This is my name"));
}
}
