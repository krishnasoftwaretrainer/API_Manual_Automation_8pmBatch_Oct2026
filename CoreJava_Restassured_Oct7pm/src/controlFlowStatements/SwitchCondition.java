package controlFlowStatements;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*
		System.out.println("Enter Month Number");
		int monthnumber=scan.nextInt();
		
		switch(monthnumber)
		{
		case 1:
		{
			System.out.println("January");
			break;
		}
		case 2:
		{
			System.out.println("February");
			break;
		}
		case 3:
		{
			System.out.println("March");
			break;
		}
		default :
		{
			System.out.println("Only enter months b/w 1 to 12");
		}
		} */
		
		// C E FF S Browser Selection
		
		System.out.println("Select Browse here");
		String browsername=scan.next().toLowerCase();
		
		switch(browsername)
		{
		case "chrome":
		{
			System.out.println("Chrome Browser Executed");
			break;
		}
		case "edge":
		{
			System.out.println("Edge Browser Executed ");
			break;
		}
		case "firefox":
		{
			System.out.println("FireFox  Browser Executed");
			break;
			//continue;
		}
		default :
		{
			System.out.println("Only select above 3 browsers");
		}
		}
	}

}
