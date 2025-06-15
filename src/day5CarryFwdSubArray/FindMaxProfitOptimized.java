package day5CarryFwdSubArray;

import java.util.List;

public class FindMaxProfitOptimized {
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
	public int maxProfit(final List<Integer> A) {
		 //the idea is by carry forward piche se max find krenge and arr[i] me se 
		  // minus krke max propfit check krenge
		  int n=A.size();
		  int max_Profit=0, right_Max=A.get(n-1);
		  for(int i=n-2;i>=0;i--)
		  {
			  //update right max
			  if(A.get(i)>right_Max)//y jo right max update ho rha h piche ki side update ho rha h
			  {						//arr[i] k right p hi rhega y... debug krk dkh lo
				  right_Max=A.get(i);
			  }
			  
			  int profit=right_Max-A.get(i);
			  
			  //update max profit
			  if(profit>max_Profit)
			  max_Profit=profit;
		  }
		  return max_Profit;
		  }
	 


}
