package new24120;
import java.util.*;


public class StreamMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ar=new ArrayList<Integer>();
ar.add(10);
ar.add(12);
ar.add(19);
ar.add(6);
Integer x=ar.stream().max((a,b)->a>b?1:-1).get();
	System.out.println(x);
	}

}
