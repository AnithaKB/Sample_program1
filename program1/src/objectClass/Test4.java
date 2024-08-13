package objectClass;
import java.util.LinkedHashSet;
public class Test4 {
public static void main(String[] args) {
	LinkedHashSet <String> lhs=new LinkedHashSet <String>();
	lhs.add("java");
	lhs.add("python");
	lhs.add("javascript");
	for(String subject:lhs) {
		System.out.println(subject);
		
	}
}
}
