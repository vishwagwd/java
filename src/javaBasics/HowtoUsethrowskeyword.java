package javaBasics;

public class HowtoUsethrowskeyword {

	public static void main(String[] args){
		
		//Throws keyword is always when used when we have method chaining, it is always put infront of the method. program will be terminated
		
		HowtoUsethrowskeyword obj = new HowtoUsethrowskeyword();
		obj.sum();

	}
	 public void sum() 
	 {
		try {
			div();
		} 
		catch(Throwable e)
		{
			
		}
		 
		 System.out.println("throws");
	 }
	 
	 public void div() throws ArithmeticException
	 {
		 int i =9/0;//exception line
		 System.out.println("sac");
	 }

}
