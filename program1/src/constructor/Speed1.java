package constructor;

public class Speed1 {
	static double d;
	static double t;
	static double speed(double d,double t) {
		return d/t;
	}
	
public static void main(String [] args) {
	double res=speed(240,6);
	System.out.println(res);
}
}
