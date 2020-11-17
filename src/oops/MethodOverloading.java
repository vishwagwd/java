package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		// Method overloading is when the method name is same with different input parameters,different data types within the same class is called method overloading
		//cannot create method inside a method
		//duplicate methods --- same methods with same number of input parameters are not allowed.
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
	}
	
	public void sum(int x)
	{
		System.out.println(x);
	}
	
	public void sum()
	{
		System.out.println("Sac");
	}
	public void sum(int k, int l)
	{
		System.out.println(k+l);
	}

}
