package javaBasics;

public class ConstructorConcept {
	
	
	public ConstructorConcept()// it looks like a method but not a method only class name and if we did not pass any a value then it is defult Constructor
	
	{
		System.out.println("Default Const");
	}
	
	public ConstructorConcept(int i)
	{
		System.out.println("Single parameter constructor ");
		System.out.println("the value of i "+i);
		
	}
	
	public ConstructorConcept(int i, int j)
	{
		System.out.println("double parameter constructor ");
		System.out.println("the value of i "+i);
		System.out.println("the value of i "+j);
		
	}

	public static void main(String[] args) {

		ConstructorConcept obj = new  ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
	}

}
