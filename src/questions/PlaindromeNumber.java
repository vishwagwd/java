package questions;

public class PlaindromeNumber {
	
	//292, 78987,151--- left to right and right to left are same

	public static void main(String[] args) {
		ispalindromenumber(161);

	}
	
	public static void ispalindromenumber(int num)
	{
		int r=0;
		int sum =0;
		int t;
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			sum = (sum*10)+r;
			num=num/10;
		}
		
		if(t==sum)
		{
			System.out.println("is palindrome number");
		}else
		{
			System.out.println("not palindrome number");
		}
		
	}

}
