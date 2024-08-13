package test;

public class Typecast {

	public static void main(String[] args) {
		//Widening
		int i=5;
		float f=i;
		System.out.println(f);
		
		//Narrowing
		double a=23.45;
		int b=(int)a;
		System.out.println(b);

	}

}
