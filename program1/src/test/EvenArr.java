package test;
import java.util.Scanner;
public class EvenArr {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
  int [] a=new int [5];
  System.out.println("enter the elements");
  for(int i=0;i<5;i++) {
	  a[i]=sc.nextInt();
  }
  System.out.println("reverse of elements");
  for(int i=4;i>=0;i--) {
	  System.out.println(a[i]);
  }
	}

}
