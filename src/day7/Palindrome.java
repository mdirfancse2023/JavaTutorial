package day7;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int rn = 0;
		
		while(temp>0) {
			int ld = temp%10;
			temp = temp/10;
			rn = rn*10+ld;

	  }
	if(rn == n) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not Palindrome");
	}
	}
}
