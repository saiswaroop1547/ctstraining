package new25120;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEmployeeData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("d://emp.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		
		dos.writeInt(1);
		dos.writeUTF("swaroop");
		dos.writeDouble(5000.00);
		
		dos.writeInt(2);
		dos.writeUTF("Vinay");
		dos.writeDouble(15000.00);
		
		dos.writeInt(3);
		dos.writeUTF("Seelam");
		dos.writeDouble(25000.00);
		
		dos.writeInt(4);
		dos.writeUTF("Kumar");
		dos.writeDouble(51000.00);
		
		dos.writeInt(1);
		dos.writeUTF("swaroop");
		dos.writeDouble(65000.00);
		System.out.println("objects written to file are" );
		System.out.println();
	}

}
