package constructor;

public class Cube {
	double length;
	double breadth;
	double height;
	Cube(double length,double breadth,double height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
double getCube() {
	return length*breadth*height;
}
}
