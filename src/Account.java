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
}