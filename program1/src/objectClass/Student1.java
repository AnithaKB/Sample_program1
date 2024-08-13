package objectClass;

public class Student1 {
int age;
int id;
String name;
Student1(int age,int id,String name){
	this.age=age;
	this.id=id;
	this.name=name;
}
public String toString() {
	return "age:"+age+",id:"+id+",name:"+name;
}
	
public boolean equals(Object o) {	
	Student1 c1=(Student1)o;
	return this.age==c1.age&&this.id==c1.id&&this.name.equals(c1.name);
}
public static void main(String [] args) {
	Student1 c1=new Student1(20,1,"Rita");
	Student1 c2=new Student1(23,2,"Sheela");
	System.out.println(c1.equals(c2));
	System.out.println(c1.toString());
	System.out.println(c2.toString());
}
}
