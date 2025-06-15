package day5_oopsSession2;

public abstract class User {
	private String userId;
	private String name;
	private String contactInfo; 
	private static int totalUsers=0;//Total users should be at class level because if we bind it to the
	//instance then for any class instance we will be having new total users. but here this will be 
	//commom for all the classes.
	
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
	public String getuserId() {
		return userId;
	}
	
	
	User() {
		userId=generateUniqueId();
	}
	
	User(String name,String contactInfo) {
		this.name=name;
		this.contactInfo=contactInfo;
		userId=generateUniqueId();
	}
	
	//copy constructor
	User(User other) {
		this.name=other.name;
		this.contactInfo=other.contactInfo; 
		userId=generateUniqueId();
	}
	
	abstract void displayDashboard();
	abstract boolean canBorrowBooks();
	
	private final String generateUniqueId() { //final so no child class can change it. 
											//and private so koi bhi new user ko create hi user na bna de.
		totalUsers++;//for every new user creation this will add new user 
		return "User - "+totalUsers;//this will be user id for every new user.
	}

}
