package oops;

public class Employee_Encaps 
{
	public static void main(String[] args) 
	{
		Customer_Encaps cus=new Customer_Encaps();
		//System.out.println(cus.balance);
		cus.setbalance(5000);
		System.out.println(cus.getaccname());
		System.out.println(cus.getaccnum());
		System.out.println(cus.getbalance());
	}

}
