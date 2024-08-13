package encapsulation;

public class Library {
private int libraryid;
private String location;
private int noofbooks;
void setLibraryid(int libraryid) {
	this.libraryid=libraryid;
}
int getLibraryid() {
	return this.libraryid;
}
void setLocation(String location) {
	this.location=location;
}
String getLocation() {
	return this.location;
}
void setNoofbooks(int noofbooks) {
	this.noofbooks=noofbooks;
}
int getNoofbooks() {
	return this.noofbooks;
}
}
