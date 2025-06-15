package day13_Array1D;

import java.util.List;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int maxSubArray(final List<Integer> A) {
	        //find psum if psum <0 then make it zero and find max of those
		  int n=A.size();
		  int[] arr=new int[n];
		  //add all values to array
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=A.get(i);
		  }
		  int max_sum=Integer.MIN_VALUE;
		  int run_sum=0;
	        for(int i=0;i<n;i++)
	        {
	        	run_sum+=arr[i];
	        	if(run_sum>max_sum)
	        	{
	        		max_sum=run_sum;
	        	}
	        	if(run_sum<0)
	        	{
	        		run_sum=0;
	        	}
	        }
	        return max_sum;
	    }

	    

}
