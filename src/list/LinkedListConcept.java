package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Goa");
		ll.add("Hassan");
		ll.add("punjab");
		ll.add("alur");
		
		System.out.println("Contents if Linked List "+ ll);
		
		//addfirst and addlast
		
		ll.addFirst("Vishwa");
		ll.addLast("gowda");
		
		System.out.println("Contents if Linked List "+ ll);
		
		//get
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		
		ll.set(0, "sanjay");
		
		System.out.println(ll.get(0));
		
		ll.removeFirst();
		
		System.out.println("**************");
		
		System.out.println("Contents if Linked List "+ ll);
		
		ll.removeLast();
		
		System.out.println("**************");
		
		System.out.println("Contents if Linked List "+ ll);
		
		ll.remove(2);
		
		System.out.println("**************");
		
		System.out.println("Contents if Linked List "+ ll);
		
		//how to print all the elements --- iterator, for loop, while loop.
		
		
		System.out.println("*****for Loop");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("*****advanced for Loop");
		
		for(String str : ll)
		{
			System.out.println(str);
		}
		
		System.out.println("*****iterator for Loop");
		
		Iterator<String> It=ll.iterator();
		while(It.hasNext())
		{
			System.out.println(It.next());
		}
		
		System.out.println("*****While");
		
		int num=0;
		while(ll.size()>num) {
			
			System.out.println(ll.get(num));
			num++;
			
		}
		
			
	}

}
