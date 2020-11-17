package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//string concatenation = left to right execution and + is the concatenation operator
		
		int a = 100;
		int b = 200;
		
		String x = "hello";
		String y  = "world";
		
		System.out.println(x+y);
		
		System.out.println(a+b);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println("The addition of a is " + (a+b));
		
		System.out.println("Hello world");//ln means new line i.e to print in the new line
		System.out.print("Hello test");//without line after this next line will print
		System.out.print("Hello test");
	}

	
	
}
