package day5CarryFwdSubArray;

import java.util.ArrayList;

public class SubArrayContainsMaxAndMin {
//	Given an array A, find the size of the smallest subarray such that it contains at least one 
//	occurrence of the maximum value of the array
//	and at least one occurrence of the minimum value of the array.

	public static void main(String[] args) {

	}
	
	public int solve(ArrayList<Integer> A)
	{
		int minValue=getMinValue(A);
		int maxValue=getMaxValue(A);
		int lastMinIndex=-1, lastMaxIndex=-1;
		int ans=Integer.MAX_VALUE;
		int n=A.size();
		
		for(int i=0;i<n;i++)
		{
			if(A.get(i)==maxValue)
			{
				lastMaxIndex=i;
			}
			if(A.get(i)==minValue)
			{
				lastMinIndex=i;
			}
			if(lastMinIndex!=-1 && lastMaxIndex!=-1)
			{
				ans=min(ans, getAbsoluteDiff(lastMaxIndex, lastMinIndex)+1);
			}
		}
		return ans;
		
    }
	public int getMaxValue(ArrayList<Integer> al)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<al.size();i++)
		{
			int v=al.get(i);
			if(v>max)
			{
				max=v;
			}
		}
		return max;
	}
	
	public int getMinValue(ArrayList<Integer> al)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<al.size();i++)
		{
			int v=al.get(i);
			if(v<min)
			{
				min=v;
			}
		}
		return min;
	}
	
	public int getAbsoluteDiff(int a,int b)
	{
		if(a>b)
		{
			return a-b;
		}
		else
		{
			return b-a;
		}
	}
	public int min(int a,int b)
	{
		if(a<b) return a;
		else return b;
	}

}
