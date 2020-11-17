package oops;

public class Callbyvalueandcallbyreference {

	
	int p;
	int q;
	
	public static void main(String[] args) {
		
		Callbyvalueandcallbyreference obj = new Callbyvalueandcallbyreference();
		int x=50;
		int y = 50;
		int i = obj.testsum(x, y);///this type is called call by value
		System.out.println(i);
		obj.p=70;
		obj.q=80;
		
		obj.swap(obj);
		System.out.println(obj.q);
		System.out.println(obj.p);
	}
	
	public int testsum(int a , int b)
	{
		a=20;
		b=30;
				
		int c=a+b;
		return c;
	}
	
	public void swap(Callbyvalueandcallbyreference t)
	{
		int temp;
		temp=t.p;//temp=70
		t.p=t.q;//t.p=80
		t.q=temp;//t.q=70
		
	}

}
