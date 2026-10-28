package oops;

public class SampleConst 
{
	public SampleConst() //Constructor
	{
		System.out.println("I am Constructor");
	}
		
	public void Sample() //Method
	{
	System.out.println("I am Method");	
	}
	
	public static void main(String[] args) 
	{
		SampleConst samp=new SampleConst();
		samp.Sample();
	}
	
}
