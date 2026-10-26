package oops;

public class WPWOR 
{
	protected void Add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		WPWOR wp=new WPWOR();
		wp.Add(22, 33);
	}
}
