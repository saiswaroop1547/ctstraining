package examples;

public class Account1 {
	private String accountNumber;
	private float balance;
	private String accountType;
	public Account1(String accountNumber,float balance,String AccountType)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.accountType=AccountType;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public float getBalance() {
		return balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public String toString()
	{
		return accountNumber+" "+accountType+" "+balance;
	}

}
