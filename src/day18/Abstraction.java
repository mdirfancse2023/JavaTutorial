package day18;

public class Abstraction {
	
	public static void repaircar(Car car) {
		System.out.println("Car is Repaired");
	}

	public static void main(String[] args) {
		
		Wagnor wag = new Wagnor();
		Audi aud = new Audi();
		
		repaircar(wag);
		repaircar(aud);
		

	}

}
