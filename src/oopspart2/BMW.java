package oopspart2;

public class BMW extends Car{//"Has-a relationship" since extends keyword

	/*method overriding-- when method is present in parent class and child class with same name and same number of arguments is called 
	 method overriding
	 preference will be given to overridden method
	 */
	
	public void start()
	{
		System.out.println("BMW start");
	}
	
	public void stop()
	{
		System.out.println("BMW stop");
	}
	
	public void safety()
	{
		System.out.println("safety");
	}
}
