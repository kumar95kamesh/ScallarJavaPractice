package stringAndNoOfOccurences;
/*
 * pallendrome statement: number reverse is same
 */
public class pallendrome {

	public static void main(String[] args) {
		String s="121";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) 
		{
			System.out.println("It is a pallendrome statement");
		}
		else 
		{
			System.out.println("it is not pallendrome");
		}
		
}

}
