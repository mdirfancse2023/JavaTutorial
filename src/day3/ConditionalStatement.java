package day3;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		
		if(a>=95 && a<=100) {
			System.out.println("IIT");
			
		}
		else if (a<95 && a>=85) {
			
			System.out.println("NIT");
		}
		else {
			
			System.out.println("Private");
		}
	
			
		}

	}
