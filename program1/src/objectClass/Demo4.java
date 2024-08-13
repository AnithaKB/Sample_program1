package objectClass;

import java.util.LinkedList;

public class Demo4 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add("java");
		l1.add(null);
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
	}
	}


