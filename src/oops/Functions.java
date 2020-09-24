package oops;

public class Functions {

	public static void main(String[] args) {
		
		//Non Static methods.
		//if we have to call non static methods we have to create object
		/*types of methods
		 * 1.No input no output
		 * 2.No input some output
		 * 3.some input some output 
		 */
		
		Functions a =new Functions();
		//after creating the object the copy all all non static methods will be give to particular object
		a.test();
		String s1=a.sachin();
		System.out.println(s1);
		int l=a.vishwa();
		System.out.println(l);
		a.sanjay(6, 2);
		
		
		}
	
	//void means does not return any value
	//return type is void
	//no input no output
	public  void test() {
		System.out.println("test method");
		
	}
	
	//return type of this method is int.
	//no input some output
	public int vishwa()
	{
		System.out.println("vishwa");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//no input some output
	//Return type is String
	public String sachin()
	{
		System.out.println("sachin");
		
		String s="selenium";
		return s;
		
	}
	
	//x and y are input parameters/arguments
	//return type is int
	public int sanjay(int x, int y)
	{
		System.out.println("sanjay");
		
		int b=x/y;
		System.out.println(b);
		return b;
	}
	
	

}
