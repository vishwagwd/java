package oopspart2;

public class HSBCBank implements USBank , BrazilBank{//achived multiple inheritence and some times it is called "is-a relation" since implements keyword

	//if the class is implementing any interface then it is mandatory to define all the methods if interface
	public void credit() {
		// TODO Auto-generated method stub
		
		System.out.println("HSBC");
		
	}

	
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("HS");
	}

	
	public void transfermoney() {
		// TODO Auto-generated method stub
		System.out.println("HSB");
	}
	
	public void educationloan()
	{
		System.out.println("el");
	}
	
	public void barcode()
	{
		System.out.println("bc");
	}


	@Override
	public void mutualfund() {
		// TODO Auto-generated method stub
		
		System.out.println("Mutual funds are beneficiary");
	}
	

}
