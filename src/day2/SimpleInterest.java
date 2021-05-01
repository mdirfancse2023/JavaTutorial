package day2;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		float r = sc.nextFloat();
		int t = sc.nextInt();
		
		float si = p*r*t/100;
		
		System.out.println("The SI is = " +si);
	}

}
