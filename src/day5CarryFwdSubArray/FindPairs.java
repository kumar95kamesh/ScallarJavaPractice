package day5CarryFwdSubArray;

public class FindPairs {
//	You have given a string A having Uppercase English letters.
//	You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public Long solve(String A) {
	        int n=A.length();
	        long no=0;
	        int count=0;
	        for(int i=0;i<n;i++)
	        {
	        	if(A.charAt(i)=='A')
	        	{
	        		count++;
	        	}
	        	if(A.charAt(i)=='G')
	        	{
	        		no+=count;
	        	}
	        }
	        return no;
	    }

}
