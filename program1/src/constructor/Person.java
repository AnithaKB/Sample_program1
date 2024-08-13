package constructor;

public class Person {
	static String name="Smith";
	static void display() {
		System.out.println("from display"+name);
	}
public static void main(String [] args) {
	display();
	System.out.println("from main"+name);
}
}
