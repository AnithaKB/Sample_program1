package encapsulation;

public class Atm {
	private int atmid;
	private String location;
	private int money;
void setAtmid(int atmid) {
	this.atmid=atmid;
}
int getAtmid() {
	return this.atmid;
}
void setLocation(String location) {
	this.location=location;
}
String getLocation() {
	return this.location;
}
void setMoney(int money) {
	this.money=money;
}
int getMoney() {
    return this.money;
}
}
