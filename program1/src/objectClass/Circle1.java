package objectClass;

public class Circle1 {
int radius;
Circle1 (int radius){
	this.radius=radius;
}
public boolean equals(Object o) {
	Circle1 c1=(Circle1)o;
	return this.radius==c1.radius;
}
public static void main(String [] args) {
	Circle1 c1=new Circle1(5);
	Circle1 c2=new Circle1(10);
	System.out.println(c1.equals(c2));
}
}
