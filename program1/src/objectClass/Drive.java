package objectClass;
import java.util.HashMap;
public class Drive {
	public static void main(String[] args) {
HashMap h=new HashMap();
 h.put(10,"dinga");
 h.put("sweety",10.45);
 h.put(1.2,100);
System.out.println(h);
System.out.println(h.get(10));
}
}