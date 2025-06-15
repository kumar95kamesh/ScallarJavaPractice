package day15InterviewProblemsArray3;

import java.util.ArrayList;

public class FindFirstMissingNumCopy {
//	Given an unsorted integer array, A of size N. Find the first missing positive integer.
//	Note: Your algorithm should run in O(n) time and use constant space.

	
		// somewhere mistake
		    public int firstMissingPositive(ArrayList<Integer> A) {
		        
		        int total = A.size();
		        for(int i=0;i<total;i++) {
		        	int n=A.get(i);
		        	if(n<=0)
		        	{
		        		continue;
		        	}
	                if(n-1==i)
	                {
	                    continue;
	                }
		        	else if(n<=total){
		        		//jo bhi value aayi use usk index pr place kr ra hu swape krk
		        		int c = A.get(n-1);
		        		A.set(n-1, n);
		        		A.set(i, c);
		        	}
		        }
		        for(int i=0;i<total;i++)
		        {
		        	if(A.get(i)!=i+1)
		        	{
		        		return i+1;
		        	}
		        }
		        return total+1;
		    
	    }

}
