package day5_oopsSession2;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
	public List<Book> bookInventory;
	public List<User> registeredUsers;
	
	public LibraryManagementSystem() {
		bookInventory=new ArrayList<>();
		registeredUsers=new ArrayList<>();
	}
	
	public void addBook(Book book){
		bookInventory.add(book);
	}
	
	public void registerUser(User user) {
		registeredUsers.add(user);
	}
	
	public Book searchBooks(String criteria) {
		for(Book book:bookInventory) {
			if(book.getTitle().equalsIgnoreCase(criteria)||book.getAuthor().equalsIgnoreCase(criteria))
				return book;
		}
		return null;
	}
	
	public Book searchBooks(String criteria, String type) {
		for(Book book:bookInventory) {
			if((book.getTitle().equalsIgnoreCase(criteria)||book.getAuthor().equalsIgnoreCase(criteria))
					&& book.getType().equalsIgnoreCase(type))
				return book;
		}
		return null;
	}
}
