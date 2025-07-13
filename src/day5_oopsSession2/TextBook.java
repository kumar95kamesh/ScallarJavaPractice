package day5_oopsSession2;

public class TextBook extends Book {
	private String subject;
	private int edition;

	
	public void displayBookDetails() {
		System.out.println("Title : "+getTitle());
		System.out.println("Author : "+getAuthor());
		System.out.println("Subject : "+subject);
		System.out.println("Edition : "+edition);
	}
	
	public boolean lend(User user) {
		return true;
	}
	public void returnBook(User user) {
		
	}
	public boolean isAvailable() {
	return true;
	}
	
	public TextBook(String title,String isbn,String author,int edition,String subject) {
		super(isbn,title,author,"Text book");
		this.subject=subject;
		this.edition=edition;
	}

}
