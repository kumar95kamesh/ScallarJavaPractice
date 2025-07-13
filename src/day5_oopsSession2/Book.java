package day5_oopsSession2;

public abstract class Book implements Lendable{
	
	private String isbn;
	private String title;
	private String author;
	private boolean isAvailable;
	private String type;
	
	public Book() {//when it will be extended in TextBook subclass we will have to initialize a constructor
		isAvailable=true; // so for that we have created this.. 
	}

	public Book(String isbn, String title, String author,String type) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.isAvailable = true;//initially lets take its available..
		this.type=type;
	}
	public boolean lend(User user) {
		if(isAvailable&&user.canBorrowBooks()) {//if book is available and user can borrow book then
			isAvailable=false;//now book is not available
			return true;
		}
		return false;
	};
	public void returnBook(User user) {
		isAvailable=true;//now book is available.
		user.returnBook();//user ne book return kr di.
	};
	
	public boolean isAvailable() {
		return isAvailable;
	};
	
	abstract void displayBookDetails();

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public String getType() {
		return type;
	}

}
