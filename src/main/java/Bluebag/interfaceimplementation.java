package Bluebag;

public class interfaceimplementation implements interface1
{
	int fees =20000;
	public void course()
	{
		System.out.println("Testing");
	}
	
	@Override
	public void tax() {
		// TODO Auto-generated method stub
		double tax=0.13;
		double actualtaxamount= (tax*fees);
		System.out.println("ypur tax amount is: "+actualtaxamount);
	}


	@Override
	public void fees() {
		System.out.println("Your fees is:" +fees);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 i = new interfaceimplementation();
		interface1 i1 = new interfaceimplementation();
		interfaceimplementation ifs = new interfaceimplementation();
		ifs.course();
		i1.fees();
		i.tax();
	}




}
