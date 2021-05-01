package day17;

public class Polymorphism {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Pet p = d;
		Animal a = d;
		
		d.walk();
		p.walk();
		
//		a.walk();

	}

}
