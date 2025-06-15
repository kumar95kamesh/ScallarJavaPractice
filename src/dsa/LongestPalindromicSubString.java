package dsa;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		String s="abcddcbbaaaa";
		//2 palindromes same length ki ho to wo bhi try kr skte h
		System.out.println(longestPalindrome(s));

	}
	 public static String expandAroundCenter(String s, int c1, int c2) {
	        int left = c1, right = c2;
	        int n = s.length();
	        //palindrome substring koi bhi.. compare to baad me kr lenge
	        while (left >= 0 && right <= n - 1 && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        //inbuilt method to return a substring from start to end
	        return s.substring(left + 1, right);
	    }
	    public static String longestPalindrome(String A) {
	        int n = A.length();
	        if (n == 0)
	            return "";
	        //agar koi bhi palindrome nhi hua to first char hi return kr do
	        String longest = A.substring(0, 1); // a single char itself is a palindrome
	        for (int i = 0; i < n - 1; i++) {
	            //for odd length of palindromic substring
	            String p1 = expandAroundCenter(A, i, i);
	            if (p1.length() > longest.length())
	                longest = p1;
	            //for even length of palindromic substring 2 values same hogi middle ki
	            String p2 = expandAroundCenter(A, i, i + 1);
	            if (p2.length() > longest.length())
	                longest = p2;
	        }
	        return longest;
	    }

}
