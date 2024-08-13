package constructor;

public class Speed {
	double distance;
	double time;
	Speed(double distance,double time){
		this.distance=distance;
		this.time=time;
	}
double getSpeed() {
	return distance/time;
}

}
