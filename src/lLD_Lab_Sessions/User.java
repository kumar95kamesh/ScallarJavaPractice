package lLD_Lab_Sessions;

public class User {
	String name;
	private String password;
	String email;
	
	public User(String name,String password,String email)
	{
		this.name=name;
		this.password=password;
		this.email=email;
	}
	
	public User(User other)//using this idea we can copy private member to other 
	{
		this.name=other.name;//other is also instance of this class.
		this.password=other.password;
		this.email=other.email;//see this implimentation in copy class
	}
}
