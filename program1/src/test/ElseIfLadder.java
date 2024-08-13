package test;

public class ElseIfLadder {

	public static void main(String[] args) {
		/*//char check
		char c='+';
		
		if (c>='a'&&c<='z'||c>='A'&&c<='Z' ) {
			System.out.println("Alphabet");
		} else if (c>='0'&&c<='9') {
			System.out.println("Numbers");
		} else{

			System.out.println("Special character");
		}*/
		//greatest
		int a=27;
		int b=43;
		int c=9;
		
		if(a>b&&a>c) {
			System.out.println("a is greatest");
		}else if (b>c) {
			System.out.println("b is greatest");
		}else {
			System.out.println("c is greatest");
		}

	}

}
