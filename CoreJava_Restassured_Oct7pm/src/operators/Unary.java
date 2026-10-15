package operators;

public class Unary {

	public static void main(String[] args) {
		int a=5,b=5,c=5,d=5;
		System.out.println(++a); //6
		System.out.println(a); //6
		
		System.out.println(b++);//5
		System.out.println(b); //6
		
		System.out.println(--c); //4
		System.out.println(c); //4
		
		System.out.println(d--);//5
		System.out.println(d); //4
	}

}
