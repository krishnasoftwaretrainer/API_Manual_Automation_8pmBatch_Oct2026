package controlFlowStatements;

import java.util.Scanner;

public class BloodDonation_NestedIf {

	public static void main(String[] args) {

		// age>=18 and weight>=40
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age here:");
		int age = scan.nextInt();
		
		if (age >= 18) // T T F
		{
			System.out.println("Enter your weight here:");
			int weight = scan.nextInt();

			if (weight >= 40) // T F
			{
				System.out.println("Eligible to donate blood");
				
			} else // Inner
			{
				System.out.println("Your are not eligible");
				System.out.println("Your weight is lessthan 40kg");
				
			}
		} else // Outer
		{
			System.out.println("Your are not eligible");
			System.out.println("Your age is lessthan 18years");
		}

	}
}
