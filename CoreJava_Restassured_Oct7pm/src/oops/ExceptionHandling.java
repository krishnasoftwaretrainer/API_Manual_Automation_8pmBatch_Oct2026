package oops;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		try
		{
		System.out.println(5/2);
		System.out.println("No Exception");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Handled");
		}
		
		finally
		{
			System.out.println("Program Success");
		} */
		
		/*
		try
		{
			String name=null;
		System.out.println(name.length());
		System.out.println("No Exception");
		}
		catch(Exception np)
		{
			System.out.println(np);
			System.out.println("Exception Handled");
		}
		
		finally
		{
			System.out.println("Program Success");
		}  */
		
		try
		{
		int a[]= {1,2,3,4};
		for(int i=0;i<5;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println("No Exception");
		
		}
		catch(Exception np)
		{
			System.out.println(np);
			System.out.println("Exception Handled");
		}
		
		finally
		{
			System.out.println("Program Success");
		}
	}

}
