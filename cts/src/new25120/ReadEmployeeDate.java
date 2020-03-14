package new25120;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadEmployeeDate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("d://emp.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream in=new DataInputStream(bis);
		double total=0.0;
		try
		{
			while(true)
				{
				int eno=in.readInt();
				String ename=in.readUTF();
				double salary=in.readDouble();
				total=total+salary;
				System.out.println(eno);
				System.out.println(ename);
				System.out.println(salary);
			
				}
		}
		catch(IOException e)
		{
			System.out.println(total);
		}
	
	
	
	}

}
