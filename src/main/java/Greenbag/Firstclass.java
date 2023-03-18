package Greenbag;

public class Firstclass {
	
	protected int c = 01234567;
	public long g=1223433545l;
	float d=1.2f;
	double e=1.234;
	String name = "sathish";
	char gender='F';
	Boolean age=true;
	
	
	static int a = 50;
	//constructor
	public Firstclass(String name)
	{
		System.out.println("This is constructor: " +a);
	}
	
	//Method with out parameter /arguments
	public void add()
	{
		int a = 10;
		int b = 70;
		int c=a+b;
		System.out.println("The addition of 2 number is: "+c);
	}
	
	//Method with parameter /arguments
	public void sub(int a,int b)
	{
		int agevalue=age();
		System.out.println(agevalue);
		String newval=Gender();
		System.out.println(newval);
		int c=a-b;
		System.out.println("The subtraction of 2 number is: "+c);
	}
	
	
	public int age()
	{
		int dob=1990;
		int currentyear=2023;
		int currentage = currentyear -dob;
		return currentage;
	}
	
	public String Gender()
	{
		String Gender="Female";
		return "F";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firstclass FB = new Firstclass("sathish");
		System.out.println("sathish kumar R");
		/*System.out.println("B.TEch");
		System.out.println("IT");*/
		System.out.print("sathish kumar R");
		System.out.print("B.TEch");
		System.out.print("IT");
		System.out.println(9);
		FB.add();
		FB.sub(20,7);
		
	}

}
