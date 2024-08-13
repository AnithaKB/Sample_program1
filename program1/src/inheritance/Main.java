package inheritance;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
	System.out.println("Select a cab");
	System.out.println("press 1 for mini");
	System.out.println("press 2 for sedan");
	System.out.println("press 3 for luxury");
	System.out.println("enter the choice");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	Cab cab=null;
	switch(choice) {
	case 1:{
		cab=new Mini();
		System.out.println("you selected mini!!!!");
		break;
	}
	case 2:{
		cab=new Sedan();
		System.out.println("you selected sedan!!!!");
		break;
	}
	case 3:{
		cab=new Luxury();
		System.out.println("you selected luxury!!!!");
		break;
	}
	default: {
		System.out.println("invalid output");
	}
	}}}
	
	