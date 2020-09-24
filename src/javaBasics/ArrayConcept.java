package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
			
		//Array==to store similar datatypes in array variable.
		//one dimensional array
		/*disadvantages
		 * size is fixed so it is called static array.-to overcome this problem we use collections like array list hashtable.-also called dynamic array
		 * stores only similar datatypes -- to overcome this problem we use object array
		 * 
		 * */
		
		//1.int array 
		//lowest index is 0 and highest index is n-1(n is the size of the array)
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		//System.out.println(i[4]);//if location doesnot exist then arrayindexoutofbound exception
		System.out.println(i[3]);
		System.out.println(i.length);//will give you the size of array
		
		
		//to print all the values of array
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		double d[]=new double[3];
		d[0]=15.11;
		d[1]=14.11;
		d[2]=13.11;
		System.out.println(d[2]);
		
		
		char c[]=new char[4];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		
		System.out.println(c[3]);
		
		String s[] = new String[2];
		s[0]="vishwa";
		s[1]="sachin";
		
		System.out.println(s[0]);
		System.out.println(s.length);
		
		//.Object array--- it is used to store different datatype values
		//object is a super class of all the classes
		
		Object ob[]=new Object[5];
		ob[0]="tom";
		ob[1]=23;
		ob[2]=12.22;
		ob[3]='c';
		ob[4]="vishwa";
		 
		System.out.println(ob[3]);
		System.out.println(ob.length);
		
	}
	
}
