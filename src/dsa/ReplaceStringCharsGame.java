package dsa;

public class ReplaceStringCharsGame {

	public static void main(String[] args) {
//		Akash likes playing with strings. One day he thought of applying 
//		following operations on the string in the given order:
//
//			Concatenate the string with itself.
//			Delete all the uppercase letters.
//			Replace each vowel with '#'.
//			You are given a string A of size N consisting of lowercase and 
//			uppercase alphabets. Return the resultant string after applying the above operations.
//
//			NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.

		
		/**
		 *  IMPORTANT NOTE: jruri nhi h ki jo bhi diya ho usi me change kre 
		 *  				nya bhi kuch bna kr usme change kr skte h
		 *  				ex k liye yha string s ko convert na krk nya string builder bnaya
		 *  				jis se space bhi cover hoga or fir use string me convert kr skte h
		 */

		String s="aAbBiIz";
		//creating new string builder
		StringBuilder sb=new StringBuilder();
		//concat the string with itself
		s+=s;
		//delete all upper case so ignoring them
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='a'&&c<='z') {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				sb.append("#");
			}
			else
			{
				sb.append(c);
			}
			}
		}
		//convert the sb to string
		String f=sb.toString();
		System.out.println(f);

	}

}
