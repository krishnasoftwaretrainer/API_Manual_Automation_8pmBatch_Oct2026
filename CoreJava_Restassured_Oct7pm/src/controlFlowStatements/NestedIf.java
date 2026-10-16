package controlFlowStatements;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		//Find Biggest number of given 3 numbers.
		//22 44  11,  33 22 11, 11 22 33
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any 3 Numbers");
		int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
		
		if(a>b) //T T F 33 22 44:33>22T 33 44 11: 33>44F
		{
			if(a>c) //T F 33>44:F
			{
				System.out.println("a is big number:"+a);
				
			}
		}
		else if(b>c)
		{
			System.out.println("b is big number:"+b);
		}
		else
		{
			System.out.println("c is big number:"+c);
		}
	}

}
