package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DemoA {
	//	@Test
	//	public static void testGrid() throws FileNotFoundException, IOException{

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties p=new Properties();
		p.load(new FileInputStream("./input/data.properties"));
		Object v = p.getProperty("city2");
		System.out.println(v);

		String v2 = p.getProperty("area");
		System.out.println(v2);

		Object v3 = p.getProperty("city1");
		System.out.println(v3);


	}	

}


