package oops;

public class MethodOverLoading3 {
	public void Addition(int a,double b)
	{
		double sum=a+b;
		System.out.println("Sum:"+sum);
	}
	public void Addition(double a,int b)
	{
		double sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public static void main(String[] args) {
		MethodOverLoading3 mol3=new MethodOverLoading3();
		mol3.Addition(10, 20.5);
		mol3.Addition(10.5, 20);
	}
}
