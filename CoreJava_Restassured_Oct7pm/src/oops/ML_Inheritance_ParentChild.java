package oops;

public class ML_Inheritance_ParentChild extends ML_Inheritance_Parent
{

	public void FatherSon()
	{
		System.out.println("FatherSon:Bike");
	}

	public static void main(String[] args) {
		
		ML_Inheritance_ParentChild ParentChild=new ML_Inheritance_ParentChild();
	
		ParentChild.Father();
		ParentChild.FatherSon();
		
	
	}
}
