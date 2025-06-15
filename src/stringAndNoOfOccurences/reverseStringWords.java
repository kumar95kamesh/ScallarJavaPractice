package stringAndNoOfOccurences;

public class reverseStringWords {

	public static void main(String[] args) {
		String s="jaipur is a good city";
		String str[]=s.split(" ");
		String rev="";
		
		for(int i=str.length-1; i>=0; i-- ) 
		{
			rev=rev+ str[i]+" ";
		}
		System.out.println(rev);

	}

}
