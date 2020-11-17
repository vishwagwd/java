package oops;

public class Car {
	
	//Global variables or class variables
	
	int mod;
	int wheel;

	public static void main(String[] args) {

		Car a = new Car(); //right hand side is the object.
		Car b = new Car(); 
		Car c = new Car(); 
		
		a.mod=2013;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2012;
		c.wheel=4;
		
		
		System.out.println("before shifting the references");
		
		System.out.println(a.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		
		System.out.println("after shifting the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(c.mod);
		System.out.println(a.mod);
				
	}

}
