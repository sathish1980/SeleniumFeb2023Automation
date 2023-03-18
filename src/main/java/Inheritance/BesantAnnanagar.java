package Inheritance;

public class BesantAnnanagar extends BeasntechnologyHead 
{
	
	public void Batch()
	{
		System.out.println("Weekday");
		System.out.println("WeekEnd");
	}
	
	public void coursesAvaiable()
	{
		System.out.println("Python");
		System.out.println("java");
		System.out.println("testing");
		System.out.println("fullstack");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantAnnanagar B = new BesantAnnanagar();
		B.coursesAvaiable();
		B.Batch();
		//BeasntechnologyHead B1= new BeasntechnologyHead();
		B.HeadBranchAddress();
	}

}
