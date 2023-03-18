package Bluebag;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {
	String filepath =System.getProperty("user.dir")+"\\input\\sampledata.properties";
	
	
	public void propertyfilehandle() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI = new FileInputStream(F);
		Properties p = new Properties();
		p.load(FI);
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("Age"));
		System.out.println(p.getProperty("degree"));
		System.out.println(p.getProperty("addss"));
		p.setProperty("addss", "chennai");
		System.out.println(p.getProperty("addss"));
		FI.close();
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		propertyfile p = new propertyfile();
		p.propertyfilehandle();
	}
}

