package javaBasics;

public class ThrowKeyword {

	public static void main(String[] args) throws Throwable {

		
		//throw keyword is used to throw an exception deliberately like our own exception 
		
		System.out.println("Vishwanath");
		
		
		try {
			throw new Exception("Vishwa Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("GOWDA");
		
		String Exec_flag="N";
		if(Exec_flag.equals("N"))
		{
			try {
				throw new Exception("Vishwa Exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
