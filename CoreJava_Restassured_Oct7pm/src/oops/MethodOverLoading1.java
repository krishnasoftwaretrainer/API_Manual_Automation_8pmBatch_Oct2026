package oops;

public class MethodOverLoading1 
{
	public void Addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum:"+sum);
	}
	public void Addition(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Sum:"+sum);
	}
	
	public void Addition(int a,int b,int c,int d)
	{
		int sum=a+b+c+d;
		System.out.println("Sum:"+sum);
	}

	public static void main(String[] args) 
	{
		MethodOverLoading1 mol=new MethodOverLoading1();
		mol.Addition(10, 20);
		mol.Addition(10, 20, 30);
		mol.Addition(10, 20, 30, 40);
		
	}
}
