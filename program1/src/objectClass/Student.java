package objectClass;

public class Student {
	int id;
	String name;
	int age;
	Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "id:"+id+",name:"+name+",age:"+age;
	}
	public static void main(String [] args) {
		Student s=new Student(1,"smith",20);
		System.out.println(s);
	}
}
