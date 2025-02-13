package project.library;

import project.library.Book;
import java.util.Arrays;

public class Library {

	private Book[] books;
	private int count;
	//Constructor for the Library. Library is capped to having only 5 books due to specifications.
	public Library() {
		this.books = new Book[5];
		this.count = 0;
	}
	//Adds a book to the library if there is space for it.
	public boolean addBook(Book book) {
		System.out.println("Adding Book...");
		if(this.count != 4) {
			this.books[count] = book;
			this.count++;
			System.out.println("Book added successfully.\n");
			return true;
		}
		else {
			System.out.println("Book could not be added as the library is full.\n");
			return false;
		}
	}
	//Searches the library by ISBN and returns null on failure.
	public Book searchByISBN(String ISBN) {
		System.out.println("Searching for book with ISBN: "+ ISBN);
		for(int i = 0; i<this.count;i++) {
			if(this.books[i].getISBN() == ISBN) {
				System.out.println("Book found: "+this.books[i].toString()+"\n");
				return this.books[i];
			}
		}
		System.out.println("Book could not be found.\n");
		return null;
	}
	//Prints all books in the library unless there are none.
	public void displayBooks() {
		if(this.count == 0) {
			System.out.println("There are no books in the library.\n");
			return;
		}
		System.out.println("All books in the library: ");
		for(int i = 0; i < this.count; i++) {
			System.out.println((i+1)+". "+this.books[i].toString());
		}
		System.out.println();
	}
	//Finds the index to remove and then shifts the array left at the removal point to fill in the gap.
	public boolean removeBook(Book book) {
		System.out.println("Removing book: "+ book.toString()+"\n");
		//At index of 10 as it is out of bounds for the array.
		int removalIndex = 10;
		for(int i = 0; i < this.count;i++) {
			if(book.equals(this.books[i])) {
				removalIndex = i;
			}
		}
		if(removalIndex == 10) {
			System.out.println("Cannot remove book "+ book.toString() + " as it is not in the library.\n");
			return false;
		}
		else {
			//This works because only the removed index ultimately gets erased. 
			for(int i = removalIndex;i<this.count;i++) {
				this.books[i] = this.books[i+1];
			}
			//Needed to erase the copy at the end.
			this.count--;
			this.books[this.count] = new Book();
			System.out.println("Successfully removed book " + book.toString()+"\n");
			return true;
		}
	}

}
