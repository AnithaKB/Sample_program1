package constructor;

public class Employee {
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	int eid;
	String name;
	Employee(int a,String b) {
		eid=a;
		name=b;
	}

}
