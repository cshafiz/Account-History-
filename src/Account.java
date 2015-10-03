public class Account{
	private String accName;
	private int balance;
	
	private Transcation [] listOfTranscation; //object array
	private int totalNumberOfTransaction;
	
	public Account(){
		this("No Name", 0, 100);
		System.out.println("Empty constructor");
	}
	public Account(String name, int balance, int transaction){
		this.accName = name;
		this.balance = balance;
		
		listOfTranscation = new Transcation[transaction];
		totalNumberOfTransaction = 0;
		
		System.out.println("valued constructor");
	}
	public void addTransaction(Account sender, Account receiver, int amount, String description){
		Transcation t;
		t = new Transcation(sender, receiver, amount, description);
		
			listOfTranscation[totalNumberOfTransaction] = t;
			totalNumberOfTransaction++;
			System.out.println("Transaction stroge is FULL");
	}
	public String getAccName(){
		return accName;
	}
	public boolean withdraw(int amount){
		if(this.balance>=amount && amount>0){
			this.balance -= amount; 
			addTransaction(this, this, amount, "Self Withdraw");
			return true;
		}else{
			System.out.println("Invalid Withdraw"); return false;
		}
	}
		public boolean deposit(int amount){
			if(amount>0){
				this.balance += amount; 
				addTransaction(this, this, amount, "Self Deposit");
				return true;
			}else{
				System.out.println("Invalid Deposit"); return false;
			}
		}
		
		public void transfer(int amount, Account rec){
			
			if(this.balance>=amount && amount>0){
				this.balance -= amount; 	
				rec.deposit(amount);
				addTransaction(this, rec, amount, "Transaction to Other Account");
				System.out.println("Valid Transaction");
			}else{
				System.out.println("Invalid Transaction");
			}	
			
			
	}
}