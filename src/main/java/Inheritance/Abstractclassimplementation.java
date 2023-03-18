package Inheritance;

public class Abstractclassimplementation extends Abstractionclass {
	
	@Override
	public void tax() {
	
	System.out.println("12% tax for goods");	
	}
	
	public void gst()
	{
		try
		{
		System.out.println("CGST: 12");
		System.out.println("SGST: 7");
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractionclass A = new Abstractclassimplementation();
		//A.gst();
		A.tax();
	}

	

}
