package objectClass;
import java.util.ArrayList;
public class Demo3 {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20.5);
	l1.add(null);
	l1.add("java");
	System.out.println(l1);
	System.out.println(l1.size());
	System.out.println(l1.remove(2));
	System.out.println(l1.isEmpty());
	System.out.println(l1);
}
}
