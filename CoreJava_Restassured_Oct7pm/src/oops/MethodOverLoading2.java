package oops;

public class MethodOverLoading2 {

	public void Addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Sum:"+sum);
	}
	public void Addition(double a,double b)
	{
		double sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public static void main(String[] args) {
		MethodOverLoading2 mol2=new MethodOverLoading2();
		mol2.Addition(10, 20);
		mol2.Addition(10.5, 20.5);
	}
}
