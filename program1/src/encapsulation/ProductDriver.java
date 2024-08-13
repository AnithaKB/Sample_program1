package encapsulation;

public class ProductDriver {
public static void main(String [] args) {
	Product p1=new Product();
	p1.setPrice(2000);
	System.out.println(p1.getPrice());
}
}
