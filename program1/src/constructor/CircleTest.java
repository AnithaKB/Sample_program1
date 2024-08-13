package constructor;

public class CircleTest {
public static void main(String [] args) {
	Circle c1=new Circle(3);
	Circle c2=new Circle(9);
	Circle c3=new Circle(20);
	System.out.println(c1.getArea());
	System.out.println(c2.getArea());
	System.out.println(c3.getArea());
}

}
