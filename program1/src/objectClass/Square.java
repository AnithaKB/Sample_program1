package objectClass;

public class Square {
int area;
Square(int area){
	this.area=area;
}
public String toString() {
	return "area:"+area;
}
public static void main(String [] args) {
Square s=new Square(12);
System.out.println(s);
}
}