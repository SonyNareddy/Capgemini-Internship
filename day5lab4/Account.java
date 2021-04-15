package day5lab4;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	 
	
	public Account(String name, double balance) {
		super();
		// TODO Auto-generated constructor stub
		this.accNum = (long)Math.random() * 10000;
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double damount)
	{
		this.balance = balance+damount;
	}
	public boolean withdraw(double wamount)
	{
		if((this.balance - wamount) > 500)
		{
			this.balance = balance-wamount;
			return true;
		}
		else
		{
			System.out.println("Withdraw not possible");
			return false;
		}
	}
	public double getbalance()
	{
		return balance;
	}
}
