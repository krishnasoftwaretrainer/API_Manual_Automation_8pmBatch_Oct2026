package controlFlowStatements;

public class Jumping {

	public static void main(String[] args) {
		
		//break;
		//continue;
		
		for(int i=1;i<=10;i++)//1<=10T
		{
			//if(i==5) //1==5F 2==5F 5==5T 6==5F
			if(i>=5)//1>=5F 5>=5T 6>=5T 7>=5T.. 10>=5T
			{
				//break;//Stop 
				continue;
			}
			System.out.println(i); //1 2 3 4 6 7 8 9 10
		}
	}

}
