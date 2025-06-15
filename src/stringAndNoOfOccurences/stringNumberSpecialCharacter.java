package stringAndNoOfOccurences;

public class stringNumberSpecialCharacter {

	public static void main(String[] args) {
		String s="abc&*1232";
		String character="";
		String special="";
		String number="";
		
		for(int i=0; i<s.length(); i++) 
		{
			if(s.charAt(i)>='A' && s.charAt(i)<'z') {
				character=character+ s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				number=number+s.charAt(i);
			}
			else 
			{
				special=special+s.charAt(i);
			}
		}
		System.out.println(character);
		System.out.println(number);
		System.out.println(special);

	}

}
