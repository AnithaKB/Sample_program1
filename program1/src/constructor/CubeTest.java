package constructor;
import java.util.Scanner;
public class CubeTest {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	double length=sc.nextDouble();
	System.out.println("enter the breadth");
	double breadth=sc.nextDouble();
	System.out.println("enter the height");
	double height=sc.nextDouble();
	Cube c1=new Cube(length,breadth,height);
	System.out.println(c1.getCube());
}
}
