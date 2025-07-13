package day5_oopsSession2;

public class NovelBook extends Book{
	private String genre;
	
	public NovelBook(String title,String isbn,String author,String genre) {
		super(isbn,title,author,"Novel Book");
		this.genre=genre;
	}

	@Override
	void displayBookDetails() {
		System.out.println("Title : "+getTitle());
		System.out.println("Author : "+getAuthor());
		System.out.println("Genre : "+genre);
	}

}
