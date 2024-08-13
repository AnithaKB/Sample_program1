package constructor;

public class Convert {
	double meter;
	Convert(double meter){
		this.meter=meter;
	}
double getKilometer() {
	return meter/1000;
}
}
