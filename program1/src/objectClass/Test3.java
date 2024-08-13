package objectClass;
import java.util.HashSet;
public class Test3 {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add(20);
	h1.add(20.67);
	h1.add(null);
	h1.add("java");
	System.out.println(h1);
	System.out.println(h1.size());
}
}
