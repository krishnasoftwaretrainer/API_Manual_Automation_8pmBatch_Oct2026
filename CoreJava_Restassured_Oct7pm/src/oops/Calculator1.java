package oops;

public class Calculator1 {

	public static void Addition() //Userdefine 
	{
	int a=20,b=10;
	int c=a+b;
	System.out.println("Addition:"+c);
	}
	
	private void Substraction() //Userdefine 
	{
	int a=20,b=10;
	int c=a-b;
	System.out.println("Substraction:"+c);
	}
	
	protected void Multification() //Userdefine 
	{
	int a=20,b=10;
	int c=a*b;
	System.out.println("Multification:"+c);
	}
	
	void Division() //Userdefine 
	{
	int a=20,b=10;
	int c=a/b;
	System.out.println("Division:"+c);
	}
	
	public static void main(String[] args) {
		
		Calculator1.Addition();
		Calculator1 cal=new Calculator1();
		cal.Substraction();
		cal.Multification();
		//Same Package and Same Class

	}

}
