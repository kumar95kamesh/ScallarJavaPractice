package day6SlidingWindow;

import java.util.ArrayList;

public class NoOfSubArraySum {
//	Given an array A of N non-negative numbers and a non-negative number B,
//	you need to find the number of subarrays in A with a sum less than B.
//	We may assume that there is no overflow.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solve(ArrayList<Integer> A, int B) {
		int count=0;
		int n=A.size();
		//find arrays sum less then b
		
		psum(A);
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int sum=0;
			if(i!=0)
			{
				sum=A.get(j)-A.get(i-1);
			}
			else sum=A.get(j);
			if(sum<B)
			{
				count++;
			}
			}
		}
		return count;
    }
	public ArrayList<Integer> psum(ArrayList<Integer> A)
	{
		int n=A.size();
		for(int i=1;i<n;i++)
		{
			int ele=A.get(i)+A.get(i-1);
			A.set(i, ele);
		}
		return A;
	}
	

}
