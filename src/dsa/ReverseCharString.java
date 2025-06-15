package dsa;

public class ReverseCharString {

	public static void main(String[] args) {
		String s="this is Rishabh";
		String reverse=solve(s);
		System.out.println(reverse);

	}
	 public static String solve(String A) {
	        char[] chararray=A.toCharArray();
	        int s=0;
	        int e=chararray.length-1;
	        while(s<e)
	        {
	            char left=chararray[s];
	            char right=chararray[e];
	            char temp=left;
	            chararray[s]=right;
	            chararray[e]=temp;
	            s++;
	            e--;
	        }
	        String st=new String(chararray);
	        return st;
	    }

}
