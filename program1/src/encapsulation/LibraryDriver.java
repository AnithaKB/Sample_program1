package encapsulation;
import java.util.Scanner;
public class LibraryDriver {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter libraryid");
	int libraryid=sc.nextInt();
	System.out.println("enter location");
	String location=sc.next();
	System.out.println("enter no of books");
	int noofbooks=sc.nextInt();
	Library l1=new Library();
	l1.setLibraryid(libraryid);
	l1.setLocation(location);
	l1.setNoofbooks(noofbooks);
	System.out.println(l1.getLibraryid());
	System.out.println(l1.getLocation());
	System.out.println(l1.getNoofbooks());
}
}
