package javaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		String x[][]=new String[3][5];
		System.out.println(x.length);///length will be total number of rows
		System.out.println(x[0].length);//total number of columns
		
		x[0][0]="sanjay";
		x[0][1]="is";
		x[2][4]="IDK";
		
		System.out.println(x[0][1]);
		
		//print all the values of 2D array
		
		for(int j=0;j<x.length;j++) {
			for(int k=0;k<x[0].length;k++) {
				System.out.println(x[j][k]);
			}
			
			
		}

	}

}
