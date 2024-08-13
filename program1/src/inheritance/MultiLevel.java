package inheritance;

public class MultiLevel {
	public static void main(String [] args) {
		RightAngledTriangle t1=new RightAngledTriangle(3,4);
		System.out.println(t1.area);
		System.out.println(t1.base);
		System.out.println(t1.height);
		t1.computeArea();
		t1.display();
	}

}
