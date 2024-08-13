package objectClass;

public class Demo1 {
	public static void main(String [] args) {
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
	finally {
		System.out.println("thank you");
	}
}}
