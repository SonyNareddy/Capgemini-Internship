package day5lab4;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("Smith", 2000);
		a1.deposit(2000);
		System.out.println("The balance after deposit "+ a1.getbalance());
		
		Account a2 = new Account("Kathy", 3000);
		a2.withdraw(2000);
		System.out.println("The balance after withdraw "+ a2.getbalance());
	}

}
