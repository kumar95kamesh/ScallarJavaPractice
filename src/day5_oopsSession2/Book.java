package day5_oopsSession2;

public abstract class Book implements Lendable{
	public boolean lend(User user) {
		return false;
	};
	public void returnBook(User user) {
		
	};
	
	public boolean isAvailable() {
		return false;
	};
}
