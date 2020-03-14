package new24120;
import java.io.*;
public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	FileInputStream fis=new FileInputStream("D:\\ctstraining\\cts\\src\\new24120\\text.txt");
	FileOutputStream fout=new FileOutputStream("d://output.txt");
	char ch;
	int i;
	while((i=fis.read())!=-1)
	{
		ch=(char) i;
		System.out.print(ch);
		fout.write(ch);
	}
	fis.close();
	fout.close();
}

catch(FileNotFoundException f)
{
	System.out.println("file does not exist");
}
catch(IOException e)
{
	System.out.println(e);
}
	}

}
