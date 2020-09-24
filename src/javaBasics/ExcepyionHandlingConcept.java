package javaBasics;

public class ExcepyionHandlingConcept {
	
	//int a=10;
	//static ExcepyionHandlingConcept obj;

	public static void main(String[] args) {
		
		//int i=9/0;
		//System.out.println(i);//Uncaught Exception
		
		//Caught Exception
		//Thread.sleep(2000);
		
		
		 // Null pointer exception : where you declare the reference variable but did not create the object and try to prefroem actions on reference variable
		//System.out.println(obj.a);
		
		/*Types of exception handling
		 * 1. Try Catch Block
		 * 2.Throws keyword
		 */
		
		
		//1. Try catch block
		
		try{
		int i =9/0;//this will throw an exception
		System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		System.out.println("Catched");
		
	}

}
