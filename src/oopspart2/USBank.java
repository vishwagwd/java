package oopspart2;

public interface USBank {
	
	int min_bal=100;//variable value cannot be changed it is final in nature.
	
	public void credit();
	public void debit();
	public void transfermoney();
	
	//only method declaration and no method body.
	//only method prototype
	//we can declare the variables and variables are by default static in nature and the value of variable will not be changed.
	//no static method in interface
	//no main method in interface
	//interfaces are abstract in nature -- we cannot create object of interface.
}
