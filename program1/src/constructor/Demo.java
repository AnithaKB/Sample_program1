package constructor;

public class Demo {
	Demo(){
		this(10);
		System.out.println("from demo no argument");
	}
	Demo(int i){
		this('a');
		System.out.println("from demo int");
	}
	Demo(char ch){
		System.out.println("from demo char");
	}
}	