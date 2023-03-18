package Greenbag;

public class conditions {
	
	public void Trafficsignal(String lightcolor,String vehicle,String patient)
	{
		if (lightcolor=="Green")
		{
			System.out.println("You ar good to go");
		}
		else if (lightcolor=="Red")
		{
			if(vehicle=="ambulance")
			{
				if (patient=="Yes")
				{
				System.out.println("You ar good to go, since you are ambulance");
				}
				else
				{
					System.out.println("You have to stop");
				}
			}
			else
			{
			System.out.println("You have to stop");
			}
		}
		else if (lightcolor=="Yellow")
		{
			System.out.println("You about to start");
		}
		else
		{
			System.out.println("You have entered incorrect color");
		}
	}
	
	public void switchconditions(String Gender)
	{
	
		switch(Gender)
		{
		case "M":
			System.out.println("You are Male");
			break;
		case "F":
			System.out.println("You are Female");
			break;
		case "T":
			System.out.println("You are Transgender");
			break;
		default:
			System.out.println("incorrect gender type");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions c = new conditions(); // instantaiation
		c.Trafficsignal("Red","ambulance","No");
		c.switchconditions("M");
	}

}
