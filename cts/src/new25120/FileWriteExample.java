package new25120;
import java.io.*;
import java.util.*;

public class FileWriteExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		InputStreamReader cin=new InputStreamReader(System.in);
		FileOutputStream out=new FileOutputStream("d://result.txt");
		try
		{
			System.out.println("eneter the stream of characters and ,'q' to quit");
			char c;
			do
			{
				c=(char) cin.read();
				out.write(c);
			}while(c!='q');
		}
		finally
		{
			
		}

	}

}
