package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) 
	{
		//1.while
		int i=0;//initialization
		while(i<=10)//conditional
		
		{
			System.out.println(i);
			i=i+1;// if this is not specified it will generate infinite loop is the disadvantage//incremental//decremental
		}
		System.out.println("**********************");
		//2.for loop
		for(int j=0;j<=10;j++) //initialization, conditional, incremental/decremental
		{
			
			System.out.println(j);
			
		}
		
		System.out.println("**********************");
		
		for (int k=10;k>=0;k--)
		{
			System.out.println(k);
		}
		
		

	}

}
