package day5lab4;

public class SavingsAccount extends Account{
	
	
	final double minBalance = 500;
	
	
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		// TODO Auto-generated constructor stub
	}

	public boolean withdraw(double wamount)
	{
		if((this.getBalance() - wamount) > minBalance)
		{
			this.setBalance(this.getBalance() - wamount);
			return true;
		}
		else
		{
			System.out.println("With draw not possible");
			return false;
		}
	}
}
