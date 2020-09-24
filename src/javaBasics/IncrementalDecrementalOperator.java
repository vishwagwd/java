package javaBasics;

public class IncrementalDecrementalOperator {

	public static void main(String[] args) {

			int i=1;
			int j=i++;//post incremental
			
			System.out.println(i);
			System.out.println(j);
			
			int a=2;
			int b=++a;//pre incremental
			
			System.out.println(a);
			System.out.println(b);
			
			int m=2;
			int n =m--;//post decremental
			System.out.println(n);
			System.out.println(m);
			
			int p=3;
			int q=--p;
			System.out.println(p);
			System.out.println(q);
	}

}