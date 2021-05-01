package day6;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		float ans = 1;
		for(float i = 2; i<=n ; i++) {
			ans = ans + 1/i;
		}
		System.out.println(ans);
		
	}

}
