package new24120;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AllMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IntStream stream=IntStream.of(3,7,9,12,14);
boolean ans=stream.noneMatch(num->num%5==0);
List<Integer> list=Arrays.asList(3,9,16,12,21);
boolean ans1=list.stream().allMatch(n->n%3==0);
System.out.println(ans);
System.out.println(ans1);
	}

}
