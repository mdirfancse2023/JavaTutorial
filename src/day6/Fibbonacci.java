package day6;
import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0,y=1;
		int n = sc.nextInt();
		System.out.println(x);
		System.out.println(y);
		
		for(int i=1 ; i<=n-2 ; i++) {
			int z = x+y;
			System.out.println(z);
			x = y;
			y = z;
		}
		
		

	}

}
