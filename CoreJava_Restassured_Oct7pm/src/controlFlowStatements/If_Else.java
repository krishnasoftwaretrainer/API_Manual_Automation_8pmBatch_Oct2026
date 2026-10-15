package controlFlowStatements;

public class If_Else {

	public static void main(String[] args) {
		int smarks=25;
		
		if(smarks>=35 && smarks<=100) //155>=35T && 155<=100F: F 
		{
			System.out.println("Pass"); //TBS
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}

}
