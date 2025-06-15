package day5_oopsSession2;

public abstract class User {
	private String userId;
	private String name;
	private String contactInfo; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	public User(String name,String contactInfo) {
		this.name=name;
		this.contactInfo=contactInfo;
	}
	
	abstract void displayDashboard();
	abstract boolean canBorrowBooks();
	public User() {}
	
	final void generateUniqueId() {
		
	}

}
