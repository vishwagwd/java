package oops;

public class Wrapperclass {

	public static void main(String[] args) {
			
		String x="100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);//data conversion from string to integer.and integer is a wrapper class
		//other wrapper classes include double boolean
		
		System.out.println(i+20);
		
		String y="12.33";
		
		double d=Double.parseDouble(y);
				System.out.println(d+0);
				
		String z="true";
		
		boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
		
		int j =200;
		
		String v =String.valueOf(j);
		
		System.out.println(v);
		
		String u = "100a";//number format exception will be observed if 
		Integer.parseInt(u);
				
		
	}

}
