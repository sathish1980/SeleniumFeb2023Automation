package Inheritance;

public class BesantAnnanagarFaculties extends BesantAnnanagar {
	
	
	public void TestingFaculty()
	{
		System.out.println("Sathish");
		System.out.println("B.TEch");
		System.out.println("Automation Tester");
	}

	public void SQLFaculty()
	{
		System.out.println("kumar");
		System.out.println("B.TEch");
		System.out.println("SQL");
	}

	public void FullstackFaculty()
	{
		System.out.println("Raja");
		System.out.println("B.TEch");
		System.out.println("Fullstack");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantAnnanagarFaculties B = new BesantAnnanagarFaculties();
		B.TestingFaculty();
		B.SQLFaculty();
		B.FullstackFaculty();
		B.HeadBranchAddress();
		B.coursesAvaiable();
	}

}
