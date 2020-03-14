package examples;
import java.util.Scanner;
	class Agstu{
	 void Agstu(int Math,int Phy,int Chem,String s) throws NegativeValuesException,ValuesOutOfRangeException
		{
		 int Avg;
			if(Math<0 || Phy<0 || Chem<0)
			throw new NegativeValuesException();
		else if(Math>100 || Phy>100 || Chem>100)
			throw new ValuesOutOfRangeException();
		else
			Avg=(Math+Phy+Chem)/3;
		System.out.println(Avg);
		}
	}
	public class AverageMarks {
		public static void main(String[] args) 
		{
				Scanner sc = new Scanner(System.in);
				for(int i=0;i<2;i++)
				{Agstu a=new Agstu();
					System.out.println("enter student details");
					String s=sc.next();
				
					System.out.println("enter their marks");
					int Math = sc.nextInt();
					int Chem=sc.nextInt();
					int Phy=sc.nextInt();
				try {				
				a.Agstu(Math,Phy,Chem,s );
				}  
				catch (NegativeValuesException e) {
					System.out.println(e);
				} catch (ValuesOutOfRangeException e) 
				{
					System.out.println(e);
				}
				}
			}
	}
	
