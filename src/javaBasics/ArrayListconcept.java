package javaBasics;

import java.util.ArrayList;

public class ArrayListconcept {

	public static void main(String[] args) {
		//it stires the values in the basis of indices
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add("string");//1
		ar.add('c');//2
		ar.add(12.33);//3
		
		System.out.println(ar.size());
		
		ar.add("ring");//4
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1= new ArrayList();///if we give Integer it will stores inly integer value
		
		ar1.add(100);
		System.out.println(ar1.size());
		
		ArrayList<String> ar2 = new ArrayList();
		
		ar2.add("sanjay");
		
		System.out.println(ar.size());
		
		ar.remove(3);
		
		System.out.println(ar.size());
	}

}
