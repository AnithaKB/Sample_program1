package objectClass;

public class Rectangle {
double length;
double breadth;
Rectangle(double length,double breadth){
	this.length=length;
	this.breadth=breadth;
}
public String toString() {
	return "length:"+length+","+"breadth:"+breadth;
}
public static void main(String [] args) {
	Rectangle r=new Rectangle(2,4);
	System.out.println(r);
}
}
