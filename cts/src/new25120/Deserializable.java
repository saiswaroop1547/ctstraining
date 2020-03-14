package new25120;
import java.io.*;

public class Deserializable {

	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
ObjectInputStream in=null;
String datafile="d://employeedata";
	try
	{
		in=new ObjectInputStream(new BufferedInputStream
				(new FileInputStream(datafile)));
	while(true)
	{
		Employee empobj=(Employee)in.readObject();
		empobj.printEmployee();
	}
	}
	catch(EOFException e)
	{
		
	}
	
	}
	}
