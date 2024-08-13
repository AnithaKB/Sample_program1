package constructor;

public class StudentTest {
public static void main(String [] args) {
	Student s1=new Student();
	Student s2=new Student(1);
	Student s3=new Student(2,"Sheela");
	Student s4=new Student(3,"rita",16);
	System.out.println(s1.sid);
	System.out.println(s1.name);
	System.out.println(s1.age);
	System.out.println(s2.sid);
	System.out.println(s2.name);
	System.out.println(s2.age);
	System.out.println(s3.sid);
	System.out.println(s3.name);
	System.out.println(s3.age);
	System.out.println(s4.sid);
	System.out.println(s4.name);
	System.out.println(s4.age);
}
}
