package day13;

public class Student {

	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		if(age==12)
			System.out.println("Done");
		else
			this.age = age;
	}

}
