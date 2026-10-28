package oops;

public class HI_Test {

	public static void main(String[] args) {
		HI_Inheritance_Child1 ch1=new HI_Inheritance_Child1();
		ch1.BaseURL();
		ch1.GETMethod();
		System.out.println("----------");
		
		HI_Inheritance_Child2 ch2=new HI_Inheritance_Child2();
		ch2.BaseURL();
		ch2.POSTMethod();
		System.out.println("----------");
		
		HI_Inheritance_Child3 ch3=new HI_Inheritance_Child3();
		ch3.BaseURL();
		ch3.PUTMethod();
	}

}
