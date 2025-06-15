package day6SlidingWindow;

import java.util.ArrayList;

public class MaxSumOfSubArray {
//	You are given an integer array C of size A. Now you need to find a subarray 
//	(contiguous elements) so that the sum of contiguous elements is maximum.
//	But the sum must not exceed B.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int maxSubarray(int A, int B, ArrayList<Integer> C) {
		 int ans=Integer.MIN_VALUE;
	        for(int i=0;i<A;i++)
	        {
	        	int carrysum=0;//sub arrays first element se hi bnayenge(for every i
	        	for(int j=i;j<A;j++)
	        	{
	        		carrysum+=C.get(j);
	        		if(carrysum<=B)
	        		{
	        			ans=max(carrysum, ans);
	        		}
	        	}
	        }
	        
	       if(ans!=Integer.MIN_VALUE) return ans;
	       else return 0;
	    }
	
	public int max(int a, int b)
	{
		if(a>=b) return a;
		else return b;
	}

}
