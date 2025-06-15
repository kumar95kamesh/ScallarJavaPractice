package dsa;

public class ToggleStringUpperLowerCase 
{
	public static void main(String[] args) {
		String s="aBcD";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			int n = 'a'-'A';
			int m='A'-'a';
			if(ch>='a'&&ch<='z')
				ch-=32; //ch-=n;
			else  
				ch+=32; //ch-=m;
			System.out.print(ch);
		}
	}

}
