package encapsulation;
import java.util.Scanner;
public class BoxTester {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	double length=sc.nextDouble();
	System.out.println("enter the breadth");
	double breadth=sc.nextDouble();
	Box b1=new Box();
	b1.setLength(length);
	b1.setBreadth(breadth);
	System.out.println(b1.getArea());
}

}
