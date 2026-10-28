package oops;

public class HI_Inheritance_Child1 extends HI_Inheritance_Parent
{
	public void GETMethod()
	{
		System.out.println("Execute GETMethod");
	}
	
	public static void main(String[] args) {
		HI_Inheritance_Child1 ch1=new HI_Inheritance_Child1();
		ch1.BaseURL();
		ch1.GETMethod();
	}

}
