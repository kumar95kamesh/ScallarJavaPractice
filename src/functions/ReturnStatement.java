package functions;

public class ReturnStatement {

	public static void main(String[] args) {
		// any question.. this code is only for the purpose how we can return
		// a string from a method
		System.out.println(ReturnStatement.height(5));//agar height() static na hota
		System.out.println(height(0));//height() static h to direct calling
	}
	public static String height(int length)
	{
		if(length<4) return "short";
		if(length>9) return "long";
		return "Normal";//ye condition h to true k sath sath false wala bhi return krana pdega
		
	}

}
