package oops;

public class StaticandNonStatic {

	String name = "vishwa";
	static int i =23;
	
	
	public static void main(String[] args) 
	{
		//to call static methods and variables
		//direct calling
		 sum();
		 //calling by class name
		 
		 StaticandNonStatic.sum();
		 
		 StaticandNonStatic obj = new StaticandNonStatic();
		 obj.sendmail();
		 

	}
	
	public void sendmail()
	{
		
	}
	
	public static void sum()
	{
		System.out.println(i);
		System.out.println();
		
		
		
	}

}
