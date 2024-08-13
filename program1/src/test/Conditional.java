package test;

public class Conditional {

	public static void main(String[] args) {
		
	
	int a=10;
	int b=7;
	int c=0;
	String x=((a>b)&&(a>c)?"a is greatest":(b>c)?"b is greatest":"c is greatest");

	int h=(a>b?a:b);
	
	System.out.println(x);
	System.out.println(h);
}}
