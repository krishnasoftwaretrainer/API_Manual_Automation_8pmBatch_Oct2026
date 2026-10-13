package basicconcepts; //User defined package 

import java.util.Scanner;

public class ScannerClass//User defined Class
{

	public static void main(String[] args) {
		// Package Class Method[Pre-define and User-define]
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any value:");
		//byte a=scan.nextByte();
		//short a=scan.nextShort();
		//int a=scan.nextInt();
		//long a=scan.nextLong();
		//float a=scan.nextFloat();
		//double a=scan.nextDouble();
		//boolean a=scan.nextBoolean();
		
		//String a=scan.next();
		//String a=scan.nextLine();
		char a=scan.next().charAt(2);
		System.out.println(a);


	}

}
