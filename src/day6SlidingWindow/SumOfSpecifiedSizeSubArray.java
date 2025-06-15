package day6SlidingWindow;

import java.util.ArrayList;

public class SumOfSpecifiedSizeSubArray {
//	Given an array A of length N. Also given are integers B and C.
//	Return 1 if there exists a subarray with length B having sum C and 0 otherwise
//	e.g. A = [4, 3, 2, 6, 1], B = 3, C = 11  explanation - The subarray [3, 2, 6] is of length 3 and sum 11.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//is wale mtd se TLE milega agar costraints bde hue to
	 public int solve(ArrayList<Integer> A, int B, int C) {
			int s=0;
			int e=B-1;
	        int n=A.size();
			while(s<e)
			{
				int sum=0;
				for(int i=s;i<=e;i++)
				{
					sum+=A.get(i);
				}
				if(sum==C) return 1;
	            if(n<=e)
	            {
					s++;
					e++;
	            }
			}
			 return 0;
	    }

}
