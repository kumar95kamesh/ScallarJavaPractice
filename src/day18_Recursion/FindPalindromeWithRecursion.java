package day18_Recursion;
/**
 * Given string A, return if palindrome and 0 if not
 */
public class FindPalindromeWithRecursion {
	    public int solve(String A) {
	        int j=A.length()-1;
	        return check(A,0,j);
	    }
	    public int check(String A,int i,int j)
	    {
	        if(i>=j) return 1; //case if only one char String is there that will be palindrome always
	        if(A.charAt(i)!=A.charAt(j)) return 0;
	        return check(A,i+1,j-1);
	    }
}
