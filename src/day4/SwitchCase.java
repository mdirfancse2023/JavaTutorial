package day4;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		float ans = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number ");
		float a = sc.nextFloat();
		System.out.println("Enter Second Number ");
		float b = sc.nextFloat();
		
		
		System.out.println("Choose the Operation +,-,*,/");
		
		String s = sc.next();
		
		
		switch(s) {
		case "+" :
			ans = a+b;
			break;
		case "-" :
			ans = a-b;
			break;
		case "*" :
			ans = a*b;
			break;
		case "/" :
			ans = a/b;
			break;
		default :
			System.out.println("Invalid Input");
		}
		System.out.println("Ans = " +ans);
		
	}

}
