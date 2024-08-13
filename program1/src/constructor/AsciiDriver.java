package constructor;
import java.util.Scanner;
public class AsciiDriver {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ascii value");
	char avalue=sc.next().charAt(0);
	Ascii a1=new Ascii(avalue);
	System.out.println(a1.getValue());
}
}
