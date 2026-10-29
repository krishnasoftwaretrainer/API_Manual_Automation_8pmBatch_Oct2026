package oops;

public class Customer_Encaps 
{
	private long accnum=1234567890l;
	private String accname="Krishna";
	private double balance=2500.00;
	
	public long getaccnum()
	{
		return accnum;
		
	}
	
	public String getaccname()
	{
		return accname;
		
	}
	
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	
	public double getbalance()
	{
		return balance;
		
	}

	

}
