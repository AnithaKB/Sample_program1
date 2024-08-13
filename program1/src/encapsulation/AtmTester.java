package encapsulation;
import java.util.Scanner;
public class AtmTester {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter atmid");
	int atmid=sc.nextInt();
	System.out.println("enter location");
	String location=sc.next();
	System.out.println("enter money");
	int money=sc.nextInt();
	Atm a1=new Atm();
	a1.setAtmid(atmid);
	a1.setLocation(location);
	a1.setMoney(money);
	System.out.println(a1.getAtmid());
	System.out.println(a1.getLocation());
	System.out.println(a1.getMoney());
}
}
