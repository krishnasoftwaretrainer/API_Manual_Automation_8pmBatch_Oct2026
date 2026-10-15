package controlFlowStatements;

import java.util.Scanner;

public class Else_If {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Marks:");
		int smarks=scan.nextInt();
		
		if(smarks>=35 && smarks<=100) //155>=35T && 155<=100F: F 
		{
			System.out.println("Pass"); //TBS
		}
		else if(smarks>=0 && smarks<35)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}

}
