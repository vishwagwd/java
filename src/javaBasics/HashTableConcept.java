package javaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
			
		Hashtable ht = new Hashtable();
		ht.put("A", "test");
		ht.put("B", "Hello");
		ht.put("C", "buy");
		
		System.out.println(ht.size());
		
		ht.put("d", "amma");
		System.out.println(ht.size());
		
		System.out.println(ht.get("C"));
		
		ht.put(1, "sing");
		ht.put(2, 100);
		
		System.out.println(ht.get(2));
		
		
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();//if we have to restrict to string , integer we have to pass the valuelike this.
		
		h.put(1, 200);
		
		System.out.println(h.get(1));
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		
		h1.put(1, "U ha ha");
	}

}
