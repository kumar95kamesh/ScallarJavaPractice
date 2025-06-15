package day6SlidingWindow;

import java.util.ArrayList;

public class SumOfAllSubArrays {
//	You are given an integer array A of length N.You have to find the sum of all subarray sums of A.
//	More formally, a subarray is defined as a contiguous part of an array which we can obtain 
//	by deleting zero or more elements from either end of the array.
//	A subarray sum denotes the sum of all the elements of that subarray.
//	Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Long subarraySum(ArrayList<Integer> A) {
        long sum=0;
        int n=A.size();
        long f= A.get(0);
        for(int i=0;i<n;i++)
        {
            if(n>1)//there was constraint 1<n<10^5
            sum+=(long)A.get(i)*(i+1)*(n-i);//type cast to avoid overflow of multiplication
            else sum= f;
        }
        return sum;
    }

}
