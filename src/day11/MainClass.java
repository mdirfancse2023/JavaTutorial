package day11;

class cat{
	
	public void walk(){
		System.out.println("Cat is walking");
	}
	public void eat(){
		System.out.println("Cat is eating");
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		cat cat1 = new cat();
		cat cat2 = new cat();
		
		cat1.walk();
		cat2.eat();

	}

}
