package arrays_strings;

import java.util.Scanner;

public class SingleDimensionArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//SR MC or MR SC
		/*
		int htno[]= {101,102,103,104,105};
		
		for(int i=0;i<5;i++)
		{
		//System.out.println(htno[i]);
			System.out.print(htno[i]+"  ");
		} */
		//Array Memory Allocation
		//datatype arryname[]=new datatype[Size];
		/*
		System.out.println("Enter array size");
		int asize=scan.nextInt();
		int htno[]=new int[asize];
		System.out.println("Enter array elements");
		
		for(int i=0;i<asize;i++)
		{
		 htno[i]=scan.nextInt();
		}
		for(int i=0;i<htno.length;i++)
		{
		//System.out.println(htno[i]);
			System.out.print(htno[i]+"  ");
		}  */
		
		String snames[]= {"Krishna","Mohan","Ramesh"};
		for(int i=0;i<snames.length;i++)
		{
		System.out.println(snames[i]);
			//System.out.print(snames[i]+"  ");
		}
	}

}
