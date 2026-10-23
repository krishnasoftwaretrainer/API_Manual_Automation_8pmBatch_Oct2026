package arrays_strings;

import java.util.Scanner;

public class StringsDeclaration {

	public static void main(String[] args) {
		// String Literal:Static and Dynamic 
		Scanner scan=new Scanner(System.in);
		String str1="Good Eveneing";
		String str2="Good Night";
		String str3="Good Eveneing";
		
		String str4=new String("Good Eveneing");
		String str5=new String("good Eveneing");
		System.out.println("Enter Strng value:");
		//String str6=scan.next();
		String str6=scan.nextLine();
		System.out.println(str6);
		
		System.out.println(str1==str3);
		System.out.println(str4==str5);
		System.out.println("----------");
		System.out.println(str1.equals(str3));
		System.out.println(str4.equals(str5));
		System.out.println("----------");
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str4.equalsIgnoreCase(str5));
		
		
	}

}
