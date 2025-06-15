package day3IntroductionToArrays;

import java.util.ArrayList;

public class GoodPair {
//	Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j
//	and (A[i] + A[j] == B). Check if any good pair exist or not.

	public static void main(String[] args) {
		

	}
	 public int solve(ArrayList<Integer> A, int B) {
	        for(int i=0;i<A.size()-1;i++)
	        {
	        	for(int j=i+1;j<A.size();j++)
	        	{
	        		int a=A.get(i);
	        		int b=A.get(j);
	        		if(a+b==B)
	        		{
	        			return 1;
	        		}
	        	}
	        }
	        return 0;
	    }

}
