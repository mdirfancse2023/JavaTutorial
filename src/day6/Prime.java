package day6;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String isprime = "Prime"; 
			
		
		for(int i = 2 ; i*i<=n ; i++) {
			if(n%i==0) {
				isprime = "Not Prime";
				break;
			
		}
		}
		if(n<2)
			isprime = "Undefined";
		
		System.out.println(isprime);
			

}
}
