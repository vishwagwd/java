package javaBasics;

public class Constructorwiththiskeyword {
	String name;
	int age;
	
	public Constructorwiththiskeyword(String name, int age)
	{
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
		
		this.name=name;///this.globalevariable = localvariable
		this.age=age;
	}

	public static void main(String[] args) {

	
		{
			Constructorwiththiskeyword obj = new Constructorwiththiskeyword("vishwa", 25);
		}

	}

}
