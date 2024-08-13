package encapsulation;
import java.util.Scanner;
public class BookDriver {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the title");
	String title=sc.next();
	System.out.println("enter the price");
	double price=sc.nextDouble();
	System.out.println("enter the author");
	String author=sc.next();
	Book b1=new Book();
	b1.setTitle(title);
	b1.setPrice(price);
	b1.setAuthor(author);
	System.out.println(b1.getTitle());
	System.out.println(b1.getPrice());
	System.out.println(b1.getAuthor());
}

}
