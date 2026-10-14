package operators;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		int a=20,b=10;
		
		System.out.println("Enter any two values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(a<b); //20<10 false
		System.out.println(a<=b); //false
		System.out.println(a>b); //true
		System.out.println(a>=b); //true 
		System.out.println(a==b); //false
		System.out.println(a!=b); //true

	}

}
