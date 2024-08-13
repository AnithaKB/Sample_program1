package encapsulation;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	void setEid(int eid) {
		this.eid=eid;
	}
int getEid() {
	return this.eid;
}
    void setName(String name) {
    	this.name=name;
    }
String getName() {
	return this.name;
}
void setSalary(double salary) {
	this.salary=salary;
}
double getSalary() {
	return this.salary;
}
}
