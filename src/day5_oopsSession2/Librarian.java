package day5_oopsSession2;

public class Librarian extends User{
	private String employeeNumber;
	
	Librarian(String employeeNumber,String name,String contactInfo) {
		super(name,contactInfo);//this is just additional part
		this.employeeNumber=employeeNumber;//Librarian will provide some emp num.
	}
	
	public void User(String name,String contactInfo) {
	}
	void displayDashboard() {
		System.out.println("Librarial Dashboard : ");
		System.out.println("Name : "+getName());
		System.out.println("Employe number : "+employeeNumber);
		
	}
	boolean canBorrowBooks() {
		return true;//he can borrow as many books.
	}
	void addNewBook(Book book) {
		System.out.println("New Book added");
	}
	void removeBook(Book book) {
		System.out.println("Book removed");
	}

}
