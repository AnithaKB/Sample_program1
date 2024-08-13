package objectClass;
import java.util.ArrayList;
public class Test2 {
public static void main(String[] args) {
	ArrayList<String>l1=new ArrayList<String>();
	l1.add("java");
	l1.add("SQL");
	for(String s:l1) {
		System.out.println(s);
	}
}
}
