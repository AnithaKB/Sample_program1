package constructor;
import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int [] n=new int [5];
	System.out.println("enter the array elements");
	for(int i=0;i<5;i++) {
		n[i]=sc.nextInt();
	}
	System.out.println("the reverse elemnts are:");
	for(int i=4;i>=0;i--) {
		 {
		System.out.println(n[i]);
	}
	}
	}}
