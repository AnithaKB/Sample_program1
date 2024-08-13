package objectClass;

public class Array {
public static void main(String [] args) {
	int [] a= {10,20,30,40,50};
	try {
	System.out.println(a[5]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("it is not within the array length");
	}
	
}
}
