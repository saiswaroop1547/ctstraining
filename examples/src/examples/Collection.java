package examples;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar=new ArrayList<Student>();
		Student s1=new Student("swaroop",21,"Hyderabad");
		Student s2=new Student("siva",20,"Hyderabad");
		Student s3=new Student("chaithanya",26,"Hyderabad");
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println("before sorting,"+ar);
		 Collections.sort(ar, Collections.reverseOrder());
		 System.out.println("after sorting,"+ar);
	}

}
