package encapsulation;
import java.util.Scanner;
public class EmployeeDriver {
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter eid");
	int eid=sc.nextInt();
	System.out.println("enter name");
	String name=sc.next();
	System.out.println("enter salary");
	double salary=sc.nextDouble();
	Employee e1=new Employee();
	e1.setEid(eid);
	e1.setName(name);	
	e1.setSalary(salary);
	System.out.println(e1.getEid());
	System.out.println(e1.getName());
	System.out.println(e1.getSalary());
}
}
