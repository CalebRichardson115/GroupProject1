package project.library;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;
    
    //Constructor for Book with no information
	public Book() {
		this.author = "unknown";
        this.title = "unknown";
        this.ISBN = "unknown";
        this.price = 0.0;
	}
	//Constructor for book given information
	public Book(String title, String author, String ISBN, double price) {
		this.author = author;
		this.title = title;
		this.ISBN = ISBN;
		this.price = price;
	}
	//Constructor for Book given a book to copy
	public Book(Book book) {
		this.title = book.title;
		this.author = book.author;
		this.ISBN = book.ISBN;
		this.price = book.price;
	}
	
	//Getter and setter functions
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public double getPrice() {
		return this.price;
	}

}
