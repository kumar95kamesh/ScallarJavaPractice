package day5_oopsSession2;

public class Member extends User {
	private int borrowedBooksCount;
	private final static int MAX_BORROW_LIMIT=5;//can be final so no-ne can change it(in same class also).
										//can be static also.. because its same for every member.
										//generally constants are static and final.
	public Member() {
		super();
		borrowedBooksCount=0;
	}
	
	public Member(String name, String contactInfo) {
		super(name, contactInfo);
		borrowedBooksCount=0;
	}

	@Override
	void displayDashboard() {
		System.out.println("Member dashboard");
		System.out.println("Member: "+getName());
		System.out.println("Number of borrowed books: "+borrowedBooksCount);
		
	}

	@Override
	boolean canBorrowBooks() {
		return borrowedBooksCount < MAX_BORROW_LIMIT;//same meaning. 
		
//		if(borrowedBooksCount < MAX_BORROW_LIMIT) return true;
//		return false;
	}
	


}
