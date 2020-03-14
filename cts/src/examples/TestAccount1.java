package examples;

public class TestAccount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Account1 account1 = new Account1("11641321" , 4000f , "savings");

System.out.println(account1);

System.out.println(account1.getAccountNumber()+" "+account1.getAccountType()+" "+account1.getBalance());

}

}
