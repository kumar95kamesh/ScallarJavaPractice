package dsa;

public class ReverseString {

	public static void main(String[] args) {
		  String A="hii how are you"; 
		String[] sp = A.split(" ");
				int start=0;
				int end=sp.length-1;
				while(start<end)
				{
					String left=sp[start];
					String right=sp[end];
					String temp=right;
					sp[end]=left;
					sp[start]=temp;
					start++;
					end--;
				}
		        String s="";
				for(String q:sp)
				{
					s+=" "+q;
				}
		       s= s.trim();
		        System.out.println(s);
		    }
	}


