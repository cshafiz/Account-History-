public class AccountHistoryMain{
	public static void main(String [] args){
		System.out.println("Account Main");
		
		Account a1 = new Account("Sun", 1000, 100);
		Account a2 = new Account("Moon", 5000,100);
		Account a3 = new Account("Jupiter", 15000,100);
		
		a1.withdraw(500);
		a1.deposit(15000);
		a1.transfer(7000, a2);
		a1.showInfo();
		a1.transfer(2000, a3);
		a1.showInfo();
		a2.showInfo();
		a3.showInfo();
		
		
	}
}