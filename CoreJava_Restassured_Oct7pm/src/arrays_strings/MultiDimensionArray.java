package arrays_strings;

import java.util.Scanner;

public class MultiDimensionArray {

	public static void main(String[] args) {
		/*
		int a[][]= {{10,20,30,55},{40,50,60,65},{70,80,90}}; //3x3=9

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		} */
		
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[3][2];
		
		System.out.println("Enter Array Values");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				 a[i][j]=scan.nextInt();
			}
			
		}
		System.out.println("Given Array Values");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
