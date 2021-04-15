package day5lab4;

public class CurrentAccount extends Account{
	private double overdraft = 10000;

	public CurrentAccount(String name, double balance) {
		super(name, balance);
		// TODO Auto-generated constructor stub
	}
	
	public boolean withdraw(double wamount)
	{
		if((this.getBalance()-wamount) < overdraft)
			return true;
		else
			return false;
	}
	
	
}
