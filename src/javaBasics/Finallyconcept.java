package javaBasics;

public class Finallyconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();

	}
	
	public static void test1()
	{
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("Inside Catch block");
		}
			
		finally
		{
			System.out.println("Inside Finallly block");
		}
	
	}

}
