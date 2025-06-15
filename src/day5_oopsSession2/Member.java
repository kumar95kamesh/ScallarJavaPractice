package day5_oopsSession2;

public class Member extends User {
	private int borrowedBooksCount;
	private int MAX_BORROW_LIMIT = 5;

	public Member(String name, String contactInfo) {
		super(name, contactInfo);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayDashboard() {
		System.out.println();
		System.out.println(borrowedBooksCount);
		
	}

	@Override
	boolean canBorrowBooks() {
		if(borrowedBooksCount < MAX_BORROW_LIMIT) return true;
		return false;
	}
	
	public Member() {
		
	}

}
