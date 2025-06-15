package day5CarryFwdSubArray;

import java.util.List;

public class FindMaxProfit {
//	Say you have an array, A, for which the ith element is the price of a given stock on day i.
//	If you were only permitted to complete at most one transaction (ie, buy one and sell
//			one share of the stock), design an algorithm to find the maximum profit.
//	Return the maximum possible profit.,,simple find max and min value 
//	for e.g. A = [1, 4, 5, 2, 4] so ans will be Buy the stock on day 0, and sell it on day 2.
//	max profit will be difference b/w max and min value( stock market me buy phle and sell baad me 
//	krenge to phle shbe choti wali and baad me bdi wali p sell krenge to profit hoga wrna
//	profit zero hoga(agar neg me hua to bhi)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public void maxProfit(final List<Integer> A) {
		  int maxProfit=Integer.MIN_VALUE;
	     //this is brute force idea..find difference of arr[i] and max value to rhs of it.
		  }
	  public int getMaxToRightSide(List<Integer> l,int startIndex)
	  {
		  int right_max=Integer.MIN_VALUE;
		  for(int i=startIndex;i<l.size();i++)
		  {
			  if(l.get(i)>right_max)
			  {
				 right_max=l.get(i);
			  }
		  }
		  return right_max;
	  }


}
