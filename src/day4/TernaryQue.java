package day4;

public class TernaryQue {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 34;
		int c = 76;
		
		int ans = 0;
		
		ans = a>b?a>c?a:c:b>c?b:c;
		
		System.out.println(ans);

	}

}
