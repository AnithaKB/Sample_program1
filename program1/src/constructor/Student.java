package constructor;

public class Student {
	int sid;
	String name;
	int age;
	Student(){	
	}
	Student(int sid){
		this.sid=sid;
	}
	Student(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	Student(int sid,String name,int age){
		this.sid=sid;
		this.name=name;
		this.age=age;
	}
}
