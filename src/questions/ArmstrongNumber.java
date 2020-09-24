package questions;

public class ArmstrongNumber {
	
	//153 407 0 1 370 371 
	//1*1*!=1, 5*5*5* =125, 3*3*3=27 and total is 153 these numbers are called armstrong number

	public static void main(String[] args) {

		isarmstrong(1);

	}
	
	
	public static void isarmstrong(int num)
	{
		int cube=0;
		int r;
		int t;
		
		t=num;
		
		while(num>0)
		{
			r=num%10;
			num = num/10;
			cube=cube+(r*r*r);
		}
		
		if(t==cube)
		{
			System.out.println("Amrstrong number");
		}else
		{
			System.out.println("Not a armstrong number");
		}
	}

}
