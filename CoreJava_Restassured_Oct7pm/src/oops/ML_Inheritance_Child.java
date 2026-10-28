package oops;

public class ML_Inheritance_Child extends ML_Inheritance_ParentChild
{
	
	public void Son()
	{
		System.out.println("Son:Car");
	}
	public static void main(String[] args) {
		ML_Inheritance_Child child=new ML_Inheritance_Child();
		child.Father();
		child.FatherSon();
		child.Son();
	}
}
