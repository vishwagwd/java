package oopspart2;

public class Testcar {

	public static void main(String[] args) 
	{
		//static polymorphism-- compile time polymorphism
		//one to many methods is called polymorphism.
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.safety();
		
		System.out.println("***********");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("***********");
		
		//Top casting
		Car c1=new BMW();/////Child class object can be reffered by parent class reference variable is call dynamic polymorphism or runtime polymorphism
		
		c1.start();
		c1.refuel();

		//Down casting.
		
		BMW b1= (BMW)new Car();//down casting is possible but it will give class cast exception
		
	}
	

}
