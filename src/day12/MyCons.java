package day12;

class car{
	
	int colour = 5;
	
	car()
	{
		
	}
}

public class MyCons {
	
	MyCons()
	{
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCons obj = new MyCons();
		car wheel = new car();
		
		System.out.println(wheel.colour);

	}

}
