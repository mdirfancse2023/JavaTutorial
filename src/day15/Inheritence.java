package day15;

public class Inheritence {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		t.name = "Rohan";
		t.walk();
		t.teach();
		
		Student s = new Student();
		s.name = "Siraj";
		s.read();
		s.walk();
		
		Person p = t ;
		System.out.println(t instanceof Person);

	}

}
