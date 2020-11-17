package javaBasics;

public class Recur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recur recur = new Recur();
		
		System.out.println(recur.isprimenumber(10));
		
		
		

}
	
	
	public  boolean isprimenumber(int num)
	{
		if(num<=1) 
		{
		return false;
		}
		
		
		for(int i=2;i<=num;i++)
		{
			if(num % i == 0)
			
			return false;
		}
				return true;
		
		
	}
}