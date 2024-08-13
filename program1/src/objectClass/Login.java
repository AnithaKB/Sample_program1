package objectClass;
import java.util.Scanner;
public class Login {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the username");
String username=sc.next();
System.out.println("enter the password");
int password=sc.nextInt();
if(username.equals("Admin")) {
	if(password==12345) {
		System.out.println("login successfully");
	}
	else {
		try {
			InvalidPasswordException e=new InvalidPasswordException();
			throw e;
		}
		catch(Exception a) {
			System.out.println("invalid password entered");
		}
	}
}
}
}
