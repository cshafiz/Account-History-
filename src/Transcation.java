public class Transcation{
	private Account sender;
	private Account receiver;	
	private int amount;
	private String additionalInfo;
	
	public Transcation(){
		this(null, null, 0, "NoInfo");
	}
	public Transcation(Account s, Account r, int amount, String info){
		this.sender = s; this.receiver = r;
		this.amount = amount;
		this.additionalInfo = info;
	}

	public void showTranscationInfo(){
		System.out.println("Sender: "+this.sender.getAccName());
		System.out.println("Receiver: "+this.receiver.getAccName());
		System.out.println("Amount: "+this.amount);
		System.out.println("Description: "+this.additionalInfo);
		System.out.println("--------------------------------------");
		
	}
}