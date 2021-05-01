package day3;
import java.util.Scanner;


public class TernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int z = sc.nextInt();
		
		String c = (z>=18)?"Adult":"Minor";
		
		System.out.println(c);
		
		

	}

}
