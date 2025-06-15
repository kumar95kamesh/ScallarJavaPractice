package stringAndNoOfOccurences;

public class reverseWordNotStatement {

	public static void main(String[] args) {	
		String s="jaipur is a good city";
	String str[]=s.split(" ");
	
	
	for(int i=0; i<str.length; i++ ) 
	{
		String rev="";
		
		String temp=str[i];
		for(int j=temp.length()-1; j>=0; j--) 
		{
		rev=rev+temp.charAt(j);
		
	}

		System.out.print(rev+" ");
}

	

	}

	}

