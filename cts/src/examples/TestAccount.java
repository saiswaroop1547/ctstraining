package examples;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account account=new Account();
account.setAccountNumber(22365412);
account.setBalance(300000);
account.setAccountType("Current");
System.out.println(account.getAccountNumber()+""+account.getAccountType()+""+account.getBalance());;
	}

}
