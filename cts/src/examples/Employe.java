package examples;

public class Employe {
	long employeId;
	String employeName;
	String employeAddress;
	long employePhone;
	double basicSalary;
	double specialAllowance;//default=250.80;
	double Hra;//default=1000.50;
	
	Employe(long Id,String Name,String address,long phone)
	{
		Id=employeId;
		Name=employeName;
		address=employeAddress;
		phone=employePhone;
		
	}
	void calculateSalary()
	{
		double salary=basicSalary+((basicSalary*specialAllowance)/100)+((basicSalary*Hra)/100);
		System.out.println("the total salary is : " +salary);
	}
}
class Manager extends Employe
{
	Manager()
	{
		
	}
}