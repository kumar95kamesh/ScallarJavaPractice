package day15InterviewProblemsArray3;

import java.util.ArrayList;

public class FindFirstMissingNum {
//	Given an unsorted integer array, A of size N. Find the first missing positive integer.
//	Note: Your algorithm should run in O(n) time and use constant space.

	// somewhere mistake
	 public int firstMissingPositive(ArrayList<Integer> A) {
	        int total = A.size();
	        for(int i=0;i<total;i++) {
	        	if(A.get(i)<=0)
	        	{
	        		A.set(i, total+2);
	        	}
	        	else  if(A.get(i)>total)
	        	{
	        		continue;
	        	}
	        	else if(A.get(i)<total)
	        	{
	        		int n = A.get(i);
	        		A.set(n-1, -1);
	        	}
	        }
	        for(int i=0;i<total;i++)
	        {
	        	if(A.get(i)>0)
	        	{
	        		return i+1;
	        	}
	        }
	        return total+1;
	    }
}
