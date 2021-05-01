package day10;

public class String {

	public static void main(java.lang.String[] args) {
		
		java.lang.String name = "Irfan";
		
		System.out.println(name.charAt(1));
		
		System.out.println(name.length());
		
		System.out.println(name.substring(2));
		
		System.out.println(name.substring(0, 2));
		
		System.out.println(name.contains("Irfan"));
		
		System.out.println(name.isEmpty());
		
//		name = name + "MD";
		
		System.out.println(name.concat("Md"));
		
		System.out.println(name.replace('I', 'E'));
		
		}

}
