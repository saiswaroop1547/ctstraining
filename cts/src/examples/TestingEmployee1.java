package examples;

public class TestingEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 emp = new Employee1();
emp.SetDetails("hari");
emp.showDetails();

emp.SetDetails("saketh", "quality");
emp.showDetails();

emp.SetDetails("faltu", "sam", "jaggu");
emp.showDetails();

emp.showData("hi",1.2f,1);
emp.showData("hi", 1.6f , 2,3);
emp.showData("hi", 1.9f, 4,5,6);

	}

}
