package day6SlidingWindow;

import java.util.ArrayList;

public class SumOfSpecifiedSizeSubArrayOptimized {
//	Given an array A of length N. Also given are integers B and C.
//	Return 1 if there exists a subarray with length B having sum C and 0 otherwise
//	e.g. A = [4, 3, 2, 6, 1], B = 3, C = 11  explanation - The subarray [3, 2, 6] is of length 3 and sum 11.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(ArrayList<Integer> A, int B, int C) {
		int s = 0;
		int e = B - 1;
		int n = A.size();
		int sum = 0;
		// phle start se end ka sum nikal lo fir phla remove and agla add
		for (int i = 0; i <= e; i++) {
			sum += A.get(i);
		}
		if(sum==C) return 1;
		if (e <= n) {
			s++;
			e++;
			while(e<n)
			{
				sum-=A.get(s-1);
				sum+=A.get(e);
				if(sum==C) return 1;
				s++;
				e++;
			}
		}
		return 0;
	}

}
