package day9;

public class Sorting {

	public static void main(String[] args) {
		
		int a[] = {2,1,8,-3,6,12,4};
		int n = a.length;
		
		for(int i = 0; i<n-1 ; i++) {
			for(int j = 0; j<n-1 ; j++) {
				if(a[j+1]<a[j]) {
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int item:a) {
		System.out.println(item);
		}

	}

}
