package new25120;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String datafile="d://employeedata";
		ObjectOutputStream out=null;
		try
		{
			Employee empobj1=new Employee(1, "sam", 5000);
			Employee empobj2=new Employee(2, "vinay", 9000);
			out=new ObjectOutputStream(new BufferedOutputStream
					(new FileOutputStream(datafile)));
			out.writeObject(empobj1);
			out.writeObject(empobj2);
		}
	finally
	{
		if(out!=null)
		{
			out.close();
		}
	}
	System.out.println("Object state is saved");
	}
	

}
