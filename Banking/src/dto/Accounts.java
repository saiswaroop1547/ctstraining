package dto;

public class Accounts 
{
	String acno;
	String name;
	String acctype;
	float balance;
	@Override
	public String toString() {
		return "Accounts [acno=" + acno + ", name=" + name + ", acctype=" + acctype + ", balance=" + balance + "]";
	}
	public Accounts(String acno, String name, String acctype, float balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.acctype = acctype;
		this.balance = balance;
	}
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}

}
