package day12;

class cars
{
	int wheel;
	String color;
	cars(int wheel)
	{
		this.wheel = wheel;
		
	}
	cars(int wheel, String color){
		this.color = color;
	}
	
	
}

public class ThisKey {

	public static void main(String[] args) {
		

		cars obj = new cars(10);
		cars obj1 = new cars(10,"Red");
		System.out.println(obj.wheel);
		System.out.println(obj1.color);
		

	}

}
