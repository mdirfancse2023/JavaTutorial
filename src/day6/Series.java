package day6;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			float ans1 = 0;
			float ans2 = 0;
			for(float i = 1; i<=n ; i=i+2) {
				ans1 = ans1 + 1/i;
			}
			for(float i = 2; i<=n ; i=i+2) {
				ans2 = ans2 + 1/i;
			}
			System.out.println(ans1-ans2);

	}

}
