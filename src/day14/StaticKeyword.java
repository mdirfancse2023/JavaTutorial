package day14;

public class StaticKeyword {

	public static void main(String[] args) {
		
		
		int a = Math.max(15, 12);
		System.out.println(Math.sqrt(16));
		System.out.println(Math.max(23, 4));
		System.out.println(a);
		
		//non static
		A objA = new A();
		A.B objB = objA.new B();
		
		
		//static
		A.C objC = new A.C();

	}

}
