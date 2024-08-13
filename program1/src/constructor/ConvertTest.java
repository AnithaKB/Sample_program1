package constructor;

public class ConvertTest {
public static void main(String [] args) {
	Convert c1=new Convert(1000);
	Convert c2=new Convert(8000);
	Convert c3=new Convert(15000);
	System.out.println(c1.getKilometer());
	System.out.println(c2.getKilometer());
	System.out.println(c3.getKilometer());
}
}
