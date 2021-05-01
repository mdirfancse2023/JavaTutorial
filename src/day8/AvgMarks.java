package day8;

import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int m[] = new int[x];
		
		
		
		for(int i=0; i<x ; i++) {
			m[i] = sc.nextInt();
		}
		int am = 0;
		for(int j=0; j<x ; j++) {
			am = am + m[j];
		}
		am = am/x;
		System.out.println(am);

	}

}
