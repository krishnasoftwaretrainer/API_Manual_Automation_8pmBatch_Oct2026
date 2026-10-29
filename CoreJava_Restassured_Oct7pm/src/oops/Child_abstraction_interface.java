package oops;

interface Parent
{
	public void Withdrawmoney();
}

public class Child_abstraction_interface implements Parent
{
	public void Withdrawmoney()
	{
		System.out.println("Withdraw Logics");
	}

}
