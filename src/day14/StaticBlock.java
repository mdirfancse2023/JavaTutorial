package day14;

public class StaticBlock {
	
	static {
		System.out.println("1");
	}
	
	static {
		System.out.println("2");
	}

	public static void main(String[] args) {
		System.out.println("3");

	}
	
	static {
		System.out.println("4");
	}

}
