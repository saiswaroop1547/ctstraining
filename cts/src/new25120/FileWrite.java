package new25120;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws FileNotFoundException,IOException 
	{
	char ch;
	int x;
	FileReader fin=new FileReader("d://result.txt");
	FileWriter fout=new FileWriter("d://fileresult.txt");
	try
	{
	x=fin.read();
	while(x!=-1)
	{
		ch=(char) x;
		fout.write(ch);
		System.out.print(ch);
		x=fin.read();
	
	}
	}
	finally
	{
		
	}
	
	}

}
