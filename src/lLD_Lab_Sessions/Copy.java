package lLD_Lab_Sessions;

public class Copy {
	public static void main(String[] args) {
		User user=new User("Rishi","pass","Mail");
		User copyUser=new User(user);
		System.out.println(copyUser);//run this in debug mode and put break points in user class where copy constructor is written.
	}

}
