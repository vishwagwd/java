package questions;

public class FactorialNumber {
	
	//factorial of 3==3*2*1
	//recurrsive and nonrecursive ways

	public static void main(String[] args) {
		
		System.out.println(factorial(0));
		System.out.println(fact(3));

	}
	
	public static int factorial(int num)//without recurrsive
	{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			return fact;
		
	}

	
	//recursive -- function calling a function
	
	public static int fact(int num)
	{
		if(num==0)
			return 1;
		else
			return (num *fact(num-1));
	}

}
