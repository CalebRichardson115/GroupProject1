package project.library;

import project.library.Book;
import java.util.Arrays;

public class Library {

	private Book[] books;
	private int count;
	//Const5ructor for the Library. Library is capped to having only 5 books due to specifications.
	public Library() {
		this.books = new Book[5];
		this.count = 0;
	}
	//Adds a book to the library if there is space for it.
	public boolean addBook(Book book) {
		if(this.count != 4) {
			this.books[count] = book;
			this.count++;
			return true;
		}
		else {
			return false;
		}
	}
	//Searches the library by ISBN and returns null on failure.
	public Book searchByISBN(String ISBN) {
		for(int i = 0; i<this.count;i++) {
			if(this.books[i].getISBN() == ISBN) {
				return this.books[i];
			}
		}
		return null;
	}

}
