package day6;

import java.util.Scanner;

public class Power {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ans = 1;
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		for(int i=1 ; i<=p ; i++) {
			ans = ans*n;
		}
		System.out.println(ans);
}
		

}
