package javaBasics;

public class Ifelseconcept {

	public static void main(String[] args) {
		
		int a =10;
		int b= 0;
		//if is a keyword 
		if(b>a) {
			System.out.println("b is greater than a");
		}else{
			System.out.println("a is greater than b");
		}
		
		//Comparision operators > < <> >= <= != ==
		
		int c=20;
		int d=20;
				if(c==d) {
					System.out.println("Print C and are equal");
				}else {
					System.out.println("C and D are not equal");
				}
				
		//write a logic to find highest number;
				
				int a1=10;
				int b1 =50;
				int c1=0;
				
				//nested if else condition
				
				if(a1>b1 & a1>c1){
					System.out.println(" ais higest number");
				}else if(b1>c1) {
					System.out.println("b1 is the highest");
					}else {
						System.out.println("c1 is the greatest");
					}
	}

}
