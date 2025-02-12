package project.library;

import project.library.Book;

public class LibraryApp {
	public static void main (String[] args) {
		//For now, use this as a function tester. We will put it to specs once Book and Library are fully functional.
		Book book1 = new Book("Cat in the Hat", "Dr. Seuss", "123456789", 7.95);
		
		System.out.println("Title: "  + book1.getTitle() + " Author: " + book1.getAuthor() + " ISBN: " + book1.getISBN() + " Price: " + book1.getPrice());
		Library lib = new Library();
		lib.addBook(book1);
		Book book2 = new Book();
		lib.addBook(book2);
		System.out.println(lib.searchByISBN("unknown").toString());
	}

}
