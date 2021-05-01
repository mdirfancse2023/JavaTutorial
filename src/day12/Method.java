package day12;

public class Method {
	
	public static void main(String[] args) {
		
//		int numa = 12;
//		int numb = 13;
		
//		int result = maxof(numa,numb);
		
		int result = maxof(100,200);
		System.out.println(result);
		
		sayhi();
		sayhi();
		sayhi();
		
		
		
	}
	
	static int maxof(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
		
	}
	
	static void sayhi()
	{
		System.out.println("hello");
	}

}
