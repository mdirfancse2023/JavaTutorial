package day7;
import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println(" * ");
		for(int i=2; i<=x-1; i++) {
			for(int j=1; j<=i; j++) {
				if(j==1 || j==i)
					System.out.print(" * ");
				else
					System.out.print("   ");
					
			}
			System.out.println();
		}
		for(int i=1; i<=x; i++) {
			System.out.print(" * ");
		}
		

	}

}
