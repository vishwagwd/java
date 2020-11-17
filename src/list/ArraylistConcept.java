package list;

import java.util.ArrayList;
import java.util.Iterator;

import javaBasics.Employee;

public class ArraylistConcept {

	public static<E> void main(String[] args) {
		
		
		/*properties of aray list
		 * it can store duplicate values
		 * maintains insertion order
		 * it is not synchronised.
		 * allows random access to fetch any values because it stores the values on the basis of indices
		 */
		
		
			
		ArrayList ar = new ArrayList();//Non generic arraylist
		ar.add(100);
		ar.add(50);
		ar.add(60);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(30);
		ar.add(30);
		ar.add("stop");
		
		System.out.println(ar.size());
		System.out.println(ar.get(5));
		
		//to print all the values on aray list we can use for loop and iterator
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//Non generics and generics
		
		ArrayList<Integer> ar1= new ArrayList<Integer>();//generic 
		ar1.add(100);
		
		//if we are not sure about the datatype then pass 'e'
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		Employee e1= new Employee("vishwa",18,"QA");
		Employee e2= new Employee("vish",18,"da");
		Employee e3= new Employee("via",18,"mg");
		
		//userdefined class arraylist
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		//Iterator to tarverse the values.
		
		Iterator<Employee> it = ar2.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		//ADD ALL METHod
		
		System.out.println("**********************");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("tom");
		ar5.add("peter");
		ar5.add("yash");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("QA");
		ar6.add("mgr");
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		System.out.println("**********************");
		
		//Remove all
		ar5.removeAll(ar6);
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		//to check the common part = retain all
		

		System.out.println("**********************");
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("tom");
		ar7.add("peter");
		ar7.add("yash");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("tom");
		ar8.add("QA");
		ar8.add("mgr");
		
		ar7.retainAll(ar8);
		
		for(int i=0;i<ar7.size();i++)
		{
			System.out.println(ar7.get(i));
		}
	}

}
