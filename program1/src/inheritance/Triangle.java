package inheritance;

public class Triangle extends Shape {
double base;
double height;
Triangle(double base,double height){
	this.base=base;
	this.height=height;
}
void display() {
	System.out.println("height:"+height);
	System.out.println("base:"+base);
}
}
