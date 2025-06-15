package dsa;

import java.util.ArrayList;

public class StringProblem {

	public static void main(String[] args) {
//		You are given a function isalpha() consisting of a character array A.
//
//		Return 1 if all the characters of a character array are
//		alphanumeric (a-z, A-Z, and 0-9) else, return 0.
		
		ArrayList<Character> al=new ArrayList<Character>();
		String s="abcdABCD0123!@#$*()_    ";
		for(int i=0;i<s.length();i++)
		{
			al.add(s.charAt(i));
		}
		
		for(int i=0;i<al.size();i++)
		{
			Character c = al.get(i);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9'))
				System.out.println(c+"1");
			else
				System.out.println(c+"0");
			
		}
				

	}

}
