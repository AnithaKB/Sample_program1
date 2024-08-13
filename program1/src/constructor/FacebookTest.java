package constructor;

public class FacebookTest {
	public static void main(String [] args) {
		Facebook e1=new Facebook("smith2@gmail.com","smith","abc123");
		System.out.println(e1.mailid);
		System.out.println(e1.name);
		System.out.println(e1.password);
	}
	

}
