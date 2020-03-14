package new25120;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		FileReader fr=new FileReader("d://db.properties");
		prop.load(fr);
		System.out.println(prop.getProperty("uname"));
		System.out.println(prop.getProperty("pwd"));
		Set s=prop.stringPropertyNames();
		System.out.println(s);
		fr.close();
	}

}
