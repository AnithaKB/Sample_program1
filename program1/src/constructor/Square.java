package constructor;

public class Square {
private	double length;
private	double breadth;
	void setLength(double length){
		this.length=length;
	}
	double getLength() {
		return this.length;
	}
	void setBreadth(double breadth) {
		this.breadth=breadth;
	}
	double getBreadth() {
		return this.breadth;
	}
    double getSquare() {
     return length*breadth;
}
}
