package day5_oopsSession2;

public class Client {
	public static void main(String[] args) {
		LibraryManagementSystem libraryManagementSystem=new LibraryManagementSystem();
		
		Book book1=new TextBook("Ncert", "123", "Rishi", 1, "Hindi");
		Book book2=new NovelBook("CBSE", "456", "Rishi", "edU");
		
		libraryManagementSystem.addBook(book1);
		libraryManagementSystem.addBook(book2);
		
		User u1=new Member("Mohit","9685742595");
		User u2=new Member("Rohit","9865748965");
		
		if(book1.lend(u1)) {//its return type was boolean so...
			System.out.println("Successfully lended the book1");
		}
		
		if(book2.lend(u2)){
			System.out.println("Successfully lended the book2");
		}
		
		book1.returnBook(u1);
		
		
		
	}

}
