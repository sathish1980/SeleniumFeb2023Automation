package Bluebag;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;



public class TextFileWrite {
	
	String direc= "C:\\\\Users\\\\sathishkumar\\\\eclipse-workspace\\\\SeleniumFeb2023\\\\input";
	String outputfile="C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumFeb2023\\input\\output.txt";
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumFeb2023\\input\\inputfile.txt";
	
	public void writeintotextfile()
	{
		try {  
			File f = new File(outputfile);
			if (f.isFile())
			if(f.exists()==false)
			{
			f.createNewFile();
			}
			FileOutputStream outputStream = new FileOutputStream(f);  
			//Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
			outputStream.write(84);  
			outputStream.close(); 
			System.out.println("done");
        } catch (Exception e) {  
            e.getMessage();  
        }  
	}
	
	public void copyfile()
	{
		File f= new File(filepath);
		File fout= new File(outputfile);
		try {
			FileUtils.copyFile(f, fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
	
	public void writeintotextfilebybyte()
	{
	     String s="Welcome to Besant. sathish kumar today is sunday";    
		try {  
			File f = new File(outputfile);
			if(f.exists()==false)
			{
			f.createNewFile();
			}
			FileOutputStream outputStream = new FileOutputStream(f);  
			//Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
			byte b[]=s.getBytes();//converting string into byte array    
			outputStream.write(b);  
			outputStream.close(); 
			System.out.println("done");
        } catch (Exception e) {  
            e.getMessage();  
        }  
	}
	
	public void writebyfilewriter()
	{
	     String s="Welcome to Besant. done";    
		try {  
			File f = new File(outputfile);
			if(f.exists()==false)
			{
			f.createNewFile();
			}
			FileWriter FL = new FileWriter(f);     
			FL.write(s);
			FL.close(); 
			System.out.println("done");
        } catch (Exception e) {  
            e.getMessage();  
        }  
	}
	
	public void readandwrite() throws IOException
	{
		File readfile= new File(filepath);
		File writefile= new File(outputfile);
		if(writefile.exists()==false)
		writefile.createNewFile();
		FileReader fr = new FileReader(readfile);
		BufferedReader br=new BufferedReader(fr); 
		//FileOutputStream outputStream = new FileOutputStream(writefile);  
		FileWriter outputStream = new FileWriter(writefile);  
		
		  String i;
			    while ((i=br.readLine()) != null)
			    {
			    	//byte b[]=i.getBytes();//converting string into byte array    
					outputStream.write(i); 
					outputStream.write("\n");
			    	//outputStream.write(b); 
					 
			    	 
			    }
			    outputStream.close();
			    fr.close();
			    System.out.println("completed");
	}

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TextFileWrite t =  new TextFileWrite();
		t.copyfile();
	}

}
