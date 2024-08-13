package constructor;

public class Example1 {
	static {
		System.out.println("from static block 1");
	}
public static void main(String [] args) {
	    System.out.println("from main method");
}
static {
	    System.out.println("from static block 2");
}
}
