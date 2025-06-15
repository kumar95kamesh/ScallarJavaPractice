package day3IntroductionToArrays;

import java.util.ArrayList;

public class SumOfMaxMinValue {
//	Given an array A of size N. You need to find the sum
//	of Maximum and Minimum element in the given array.

	public static void main(String[] args) {
		

	}
	  public int solve(ArrayList<Integer> A) {
		  int m=max(A);
		  int n=min(A);
		  return m+n;
	    }
	  public int max(ArrayList<Integer> A)
	  {
		  int n=A.size();
		  int max=Integer.MIN_VALUE;
		  for(int i=0;i<n;i++)
		  {
			  if(A.get(i)>max)
			  {
				  max=A.get(i);
			  }
		  }
		  return max;
	  }
	  public int min(ArrayList<Integer> A)
	  {
		  int n=A.size();
		  int min=Integer.MAX_VALUE;
		  for(int i=0;i<n;i++)
		  {
			  if(A.get(i)<min)
			  {
				  min=A.get(i);
			  }
		  }
		  return min;
	  }


}
