package nonprimitivetc;

public class C {
public static void main(String [] args) {
	A a1=new B(); //upcasting
	System.out.println(a1 instanceof B);
	a1.name="Deepti";
	B b1=(B)a1; //downcasting
	b1.age=18;
	System.out.println(b1.name);
	System.out.println(b1.age);
}
}
