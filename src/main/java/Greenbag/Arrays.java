package Greenbag;

public class Arrays {
	
	int d=10;
	int[] a= {10,2,3,4,5,6,7};
	String[] name= {"sathish","kumar","R"};
	
	public void arrayimplementation()
	{
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays a = new Arrays();
		a.arrayimplementation();
	}

}
