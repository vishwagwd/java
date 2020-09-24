package oopspart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HSBCBank h = new HSBCBank();
		h.barcode();
		h.credit();
		h.debit();
		h.educationloan();
		h.mutualfund();
		
		///child class object can be referred by parent interface reference variable.
		
		   USBank u = new HSBCBank();
		   u.credit();
		   u.debit();
		   u.transfermoney();
		  
		   
		   System.out.println(USBank.min_bal);
		   
		   BrazilBank b = new HSBCBank();
		   b.mutualfund();
		   

	}

}
