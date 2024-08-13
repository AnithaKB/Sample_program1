package inheritance;

public class Child extends Parent {
	static {
		System.out.println("child is loaded");
	}
static void respect() {
	System.out.println("respect elders");
}
}
