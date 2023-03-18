package Bluebag;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TextfileRead {

	
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumFeb2023\\input\\inputfile.txt";
	//String filepath1="C:\\Users\\sathishkumar\\eclipse-workspace\\JAVABasics\\inputfiles\\inputfile.txt";

	public void readonecgharacter() throws IOException
	{
		File f= new File(filepath);
		//File f1= new File(filepath1); /// tarining purpose
		FileInputStream fr = new FileInputStream(f);
		//or
		//FileInputStream fr = new FileInputStream(filepath);
		//FileReader fr = new FileReader(f);
		int i=fr.read();
		System.out.println((char)i);
			/* int i;
			    while ((i=fr.read()) != -1)
			    {
			      System.out.print((char) i);
			  }*/
	}
	
	public void readallcharacter() throws IOException
	{
		File f= new File(filepath);
		//FileInputStream fr = new FileInputStream(f);
		FileReader fr = new FileReader(f);
		  int i;
			    while ((i=fr.read()) != -1)
			    {
			     System.out.print((char) i);
			     try {
					Thread.sleep(100);
				} 
			      catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    }
	}
	
	public void readlinebyline() throws IOException
	{
		File f= new File(filepath);
		FileReader fr = new FileReader(f);
		BufferedReader br=new BufferedReader(fr); 
		  String i;
			    while ((i=br.readLine()) != null)
			    {
			      System.out.println(i);
			      try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    }
	}
	
	public void printonlyifwehavespecificword(String searchtext) throws IOException
	{
		File f= new File(filepath);
		FileReader fr = new FileReader(f);
		BufferedReader br=new BufferedReader(fr); 
		int count=0;
		  String i;
			    while ((i=br.readLine()) != null)
			    {
			    	count=count+1;
			    	String[] strsplit=i.split("\\s");
			    	for(int j=0;j<strsplit.length;j++)
			    	{
			    		if(strsplit[j].equalsIgnoreCase(searchtext))
			    		{
			    			//System.out.println(i);
			    			//System.out.println(count);
			    			System.out.println("Then given string: "+searchtext+" is present in "+count + " st row present in " + j+ " array position");
							System.out.println(i);
			    		}
			    		
			    	}
			      
			    }
			    fr.close();
			    br.close();
			    
			    
	}
	
	
	
	public void countofstring(String searchtext) throws IOException
	{
		File f= new File(filepath);
		FileReader fr = new FileReader(f);
		BufferedReader br=new BufferedReader(fr); 
		  String i;
		  int count=0;
		  int row=0;
			    while ((i=br.readLine()) != null)
			    {
			    	row=row+1;
			    	String[] strsplit=i.split("\\s");
			    	for(int j=0;j<strsplit.length;j++)
			    	{
			    		if(strsplit[j].contains(searchtext))
			    		{
			    			count=count+1;
			    			//System.out.println("The given value present in Row no: "+row);
			    			
			    		}
			    	}
			    	
			      
			    }
			    System.out.println("The given String "+searchtext+" is present "+count +" times");
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TextfileRead T = new TextfileRead();
		T.readlinebyline();
		T.countofstring("B.tech");
	}

}
