package constructor;
import java.util.Scanner;
public class SquareTest {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	double length=sc.nextDouble();
	System.out.println("enter the breadth");
	double breadth=sc.nextDouble();
	Square s1=new Square();
	s1.setLength(length);
	s1.setBreadth(breadth);
	System.out.println(s1.getSquare());
}
}
