package project.library;

import project.library.Book;
import project.library.Library;

public class LibraryApp {
	public static void main (String[] args) {
		//Initializes 3 books in different ways. Also initializes library.
		Book book1 = new Book("Cat in the Hat", "Dr. Seuss", "123-456789", 7.95);
		Library lib = new Library();
		Book book2 = new Book();
		Book book3 = new Book(book1);
		//Setting new values for book2 and book3
		book2.setAuthor("Homer");
		book2.setTitle("The Odyssey");
		book2.setISBN("123-456780");
		book2.setPrice(35.99);
		
		book3.setAuthor("Jeff Kinney");
		book3.setTitle("Diary of a Wimpy Kid");
		book3.setISBN("123-456781");
		book3.setPrice(12.25);
		
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		//Does a successful search and then an unsuccessful search.
		lib.searchByISBN("123-456780");
		lib.searchByISBN("123-456782");
		//Displays before and after removal and then fails a removal.
		lib.displayBooks();
		
		lib.removeBook(book2);
		
		lib.displayBooks();
		
		lib.removeBook(book2);
		
	}

}
