package day5_oopsSession2;

public class Librarian extends User{
	private String employeeNumber;
	
	public void User(String name,String contactInfo) {
		
	}
	void displayDashboard() {
		System.out.println(employeeNumber);
		
	}
	boolean canBorrowBooks() {
		return true;
	}
	void addNewBook(Book book) {
		
	}
	void removeBook(Book book) {
		
	}

}
