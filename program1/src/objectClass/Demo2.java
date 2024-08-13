package objectClass;

public class Demo2 {
public static void add()throws ArithmeticException{
System.out.println("add start");
System.out.println(10/0);
System.out.println("add end");
}
public static void main(String [] args) {
	System.out.println("main start");
try {
	add();
}
catch(ArithmeticException e)
{
	System.out.println("handled");	
}
System.out.println("main end");
}
}
