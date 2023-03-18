package Inheritance;

public class Methodoverloading {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		System.out.println("2 param");
	}
	

	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
		System.out.println("2 param with double");
	}
	
	public void add(int a, int b , int d)
	{
		int c=a+b+d;
		System.out.println(c);
		System.out.println("3 param");
	}

	
	public void add(int a,int b, int d, int e)
	{
		int c=a+b+d+e;
		System.out.println(c);
		System.out.println("4 param");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading M = new Methodoverloading();
		M.add(2.7, 3);
	}

}
