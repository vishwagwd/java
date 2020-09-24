package oops;

public class LocalvsGlobalVariables {
	
	//Global variables/class variables
	String name="tom";
	int age=25;
	
	public static void main(String[] args) {

		int i=10;///local variables for main method
		System.out.println(i);
		LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}
	
	public void sum()
	{
		int i=15;//all three are local var for sum method
		int j=20;
			
		System.out.println(i);
	}

}
