package day4ArrayPrefixSum;

import java.util.ArrayList;

public class SumQuerry {
//	You are given an integer array A of length N.
//	You are also given a 2D integer array B with dimensions M x 2,
//	where each row denotes a [L, R] query.
//	For each query, you have to find the sum of all elements
//	from L to R indices in A (0 - indexed).
//	More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public  ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
		 ArrayList<Long> psum=new ArrayList<Long>();//chahe to orignal wali list
		 int n=A.size();				//me hi changes kr skte h
		 long first=A.get(0);
		 psum.add(first);
		 for(int i=1;i<n;i++)
		 {
			 long s=A.get(i)+psum.get(i-1);
			 psum.add(s);
		 }
		 //apply querry
		 int q=B.size();
		 ArrayList<Long> ans=new ArrayList<Long>();
		 
		 for(int i=0;i<q;i++)
		 {
			 int startIndex=B.get(i).get(0);
			 int endIndex=B.get(i).get(1);
			// solve querry from startIndex to end Index
			 long sum=0;
			 if(startIndex==0)
			 {
				 sum=psum.get(endIndex);
			 }
			 else
			 {
				 sum=psum.get(endIndex)-psum.get(startIndex-1);
			 }
			 ans.add(sum);
		 }
		 
		 return ans;
	    }

}
