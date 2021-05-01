package day4;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int ans = 0;
		
		if(x>y) {
			if(x>z) {
				ans = x;
			}
			else {
				ans = z;
			}
		}
		else {
			if(y>z) {
				ans = y;
			}
			else {
				ans = z;
			}
		}
		System.out.println("Greater is " + ans);
				

	}

}
