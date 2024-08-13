package inheritance;

public class Animal implements AnimalEat,AnimalTravel {
	public void eat() {
System.out.println("animal is eating");
	}
	public void travel() {
		System.out.println("animal is travelling");
			}
}
