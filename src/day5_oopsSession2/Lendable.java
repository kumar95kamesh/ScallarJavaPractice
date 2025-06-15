package day5_oopsSession2;

public interface Lendable {
	boolean lend(User user);
	void returnBook(User user);
	boolean isAvailable();


}
