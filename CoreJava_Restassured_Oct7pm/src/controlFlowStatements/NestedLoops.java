package controlFlowStatements;

public class NestedLoops {

	public static void main(String[] args) {
		/*
		1	2	3	4	5
		1	2	3	4	5	
		1	2	3	4	5	
		1	2	3	4	5	
		1	2	3	4	5	*/
		
		/*
		for(int i=1;i<=5;i++) //rows 1<=5T 2<=5T
		{
			for(int j=1;j<=3;j++)//columns
			{
				//System.out.print(j+"    ");
				System.out.print(i+"    ");
			}
			System.out.println();
		} */
		/*
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=5)
			{
				System.out.print(j+"  ");
				j++;
			}
			System.out.println();
			i++;
		} */
		/*
		1
		1	2
		1	2	3
		1	2	3	4
		1	2	3	4	5 */

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				//System.out.print(j+"    ");
				//System.out.print(i+"    ");
			System.out.print(" **** ");
			}
			System.out.println();
			}
		}
	}


