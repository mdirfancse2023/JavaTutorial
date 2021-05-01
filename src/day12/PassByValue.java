package day12;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 33;
		int d = 56;
		
		swap(c,d);
		
	}
	
	static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
		
	
	}

}
