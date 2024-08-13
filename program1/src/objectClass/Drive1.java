package objectClass;

import java.util.LinkedHashMap;

public class Drive1 {
public static void main(String[] args) {
	LinkedHashMap <Integer,String> lhm=new LinkedHashMap <Integer,String>();
	lhm.put(10,"java");
	lhm.put(20,"SQL");
	lhm.put(30,"web");
	System.out.println(lhm);
}
}
