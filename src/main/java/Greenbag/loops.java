package Greenbag;

import java.io.IOException;

public final class loops {
	
	final int z=35;
	public final void forloop(int firstvalue)
	{
	/*	for(int a=2;a<=10;a++)
		{
			System.out.println(a);	
		}*/
		try {
			finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(z);
		int next10digit=firstvalue-10;
		for(int a=firstvalue;a>=next10digit;a--)
		{
			System.out.println(a);	
			a=a-1;
		}
	}

	
	public void whileloop()
	{
		int a=1;
		while(a>=0)
		{
			System.out.println(a);
			a=a-1;
		}
	}
	
	public void dowhileloop() throws ArithmeticException,IOException
	{
		int a=1;
		do
		{
			System.out.println(a);
			a=a+1;
		}
		while(a<11);
	}
	
	public void exceptionhandling(int a,int b)
	{
		//try
		//{
		
		//int c =a/b;
		String[] name= null;
		throw new ArithmeticException("Hi this is sathish");

		/*if (name[0]=="sathish")
		{
		System.out.println("Yes");
		}*/
		//}
		/*catch(ArithmeticException s)
		{
			System.out.println("You have entered zero value in the denominator");
		}
		catch(NullPointerException s)
		{
			System.out.println("Entered a null vaue");
		}
		catch(Exception s)
		{
			System.out.println(s);
		}
		finally
		{
			System.out.println("finally block");
		}*/
		
	}
	public static void main(String[] args) throws ArithmeticException, IOException {
		// TODO Auto-generated method stub
		loops l = new loops();
		l.exceptionhandling(2,0);
		//l.forloop(50);
		l.whileloop();
		l.dowhileloop();
	}

}
