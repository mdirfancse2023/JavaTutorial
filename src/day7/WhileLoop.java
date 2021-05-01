package day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(temp>0) {
			int ld = temp%10;
			temp = temp/10;
			sum = sum+ld;
			
			
		}
		System.out.println(sum);
			

	}

}
