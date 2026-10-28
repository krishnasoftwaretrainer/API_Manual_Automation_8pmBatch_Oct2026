package oops;

public class SL_Inheritance_Child extends SL_Inheritance_Parent
{

	public void Son()
	{
		System.out.println("Son have Bike");
	}
	
	public static void main(String[] args) {
		SL_Inheritance_Child child=new SL_Inheritance_Child();
		child.Father();
		child.Son();
	}
}
