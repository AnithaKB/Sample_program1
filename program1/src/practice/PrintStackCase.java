package practice;

public class PrintStackCase {
		public static void display() throws Exception{
		for(int i=1;i<=5;i++) {
		System.out.println(i);
		Thread.sleep(1500);
		}
		}
		public static void main(String[] args) {
		System.out.println("Main Start");
		try {
		display();
		} catch (Exception e) {
		e.printStackTrace();
		}
		System.out.println("Main End");
		}
		}

