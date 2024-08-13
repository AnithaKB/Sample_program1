package constructor;

public class Demo1 {
	double length;
	double breadth;
	Demo1(double length,double breadth) {
	this.length=length;
	this.breadth=breadth;
}
double getArea() {
	return length*breadth;
}
}