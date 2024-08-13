package encapsulation;

public class Book {
	private String title;
	private double price;
	private String author;
	void setTitle(String title) {
		this.title=title;
	}
	String getTitle() {
		return this.title;
	}
    void setPrice(double price) {
    	this.price=price;
    }
    double getPrice() {
    	return this.price;
    }
    void setAuthor(String author) {
    	this.author=author;
    }
    String getAuthor() {
    	return this.author;
    }
}
