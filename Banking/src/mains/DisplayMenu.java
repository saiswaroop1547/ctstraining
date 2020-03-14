package mains;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AccountsDAO;
import dao.UserDAO;
import dto.Accounts;
import dto.Users;

	import java.sql.SQLException;
	import java.util.Scanner;

	import dao.UserDAO;
	import dto.Accounts;
	import dto.Users;

	public class DisplayMenu {
		public static int existingUser() throws SQLException {
			AccountsDAO accountdao = new AccountsDAO("jdbc:mysql://localhost:3306/banking","root","root");
			UserDAO userdao = new UserDAO("jdbc:mysql://localhost:3306/banking","root","root");
			Scanner sc = new Scanner(System.in);
			System.out.println("Bank Customer Application");
			System.out.println("Enter User name");
			String uname = sc.next();
			System.out.println("Enter password");
			String pwd = sc.next();
			Users user = new Users(uname,pwd);
			int status = userdao.checkUser(user);
			userdao.disconnect();
			return status;
			
		}
		public static void newUser() throws SQLException {
			UserDAO userdao = new UserDAO("jdbc:mysql://localhost:3306/banking","root","root");
			AccountsDAO accountdao = new AccountsDAO("jdbc:mysql://localhost:3306/banking","root","root");
			Scanner sc = new Scanner(System.in);
			System.out.println("you have to register first...");
			System.out.println("Enter username");
			String uname = sc.next();
			System.out.println("Enter password");
			String pwd = sc.next();
			Users user = new Users(uname,pwd);
			System.out.println("Enter AccountNumber");
			String acctNumber = sc.next();
			System.out.println("Enter AccountType");
			String acctType = sc.next();
			System.out.println("Enter Customer Name");
			String custName = sc.next();
			System.out.println("Enter the amount");
			float balance = sc.nextFloat();
			Accounts accounts = new Accounts(acctNumber,acctType,custName,balance);
			UserDAO.createCustomer(accounts, user);
			
		}
		public void showMenuOptions() throws SQLException {
			Scanner sc = new Scanner(System.in);
			System.out.println("***************Bank Application ************");
			System.out.println("1.New User...");
			System.out.println("2.Existing User...");
			System.out.println("Enter your choice...");
			int choice= sc.nextInt();
			switch(choice) {
			case 1: newUser();break;
			case 2:
				int status=existingUser();
			
				if(status==1)
				{
					
					System.out.println("1.Deposit..");
					System.out.println("2.Withdraw.");
					System.out.println("3.Balance..");
					System.out.println("4.Exit");
					System.out.println("Enter your choice..");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						System.out.println("Enter account number");
						String acno=sc.next();
						System.out.println("enter the amount");
						float amt=sc.nextFloat();
						AccountsDAO.deposit(acno, amt);
						break;
					case 2:
						System.out.println("enter your account number");
						String acno1=sc.next();
						System.out.println("enter the amount");
						float amt1=sc.nextFloat();
						AccountsDAO.withdraw(acno1, amt1);
						break;
					case 3:
						System.out.println("Enter account number");
						String acno2=sc.next();
						AccountsDAO.getBalance(acno2);
					case 4:
						System.exit(0);
					}
					}break;
				
			default: System.out.println("Wrong Choice...");}
			}
		}
	