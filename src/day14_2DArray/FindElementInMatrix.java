package day14_2DArray;

import java.util.ArrayList;

public class FindElementInMatrix {
//	Given a matrix of integers A of size N x M and an integer B.
//	In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
//	If A[i][j] = B then return (i * 1009 + j)
//	If B is not present return -1.
//	Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
//	Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
//	Note 3: Expected time complexity is linear
//	Note 4: Use 1-based indexing
//	A = [[1, 2, 3]
//		[4, 5, 6]
//		[7, 8, 9]]
	
	 public int solve(ArrayList<ArrayList<Integer>> A, int B) {
	        int rows=A.size();
	        int col=A.get(0).size();
	        int i=0;
	        int j=col-1;
	        int ans=Integer.MAX_VALUE;
	        while(i<rows && j>=0)
	        {
	            int ele=A.get(i).get(j);
	            if(ele==B){ 
	                ans=min(ans,((i+1)*1009+(j+1)));//agar elements duplicate hue ek hi line me tb k liye 
	               j--;
	            }
	            else if(ele>B) j--;
	            else i++;
	        }
	        if(ans!=Integer.MAX_VALUE)
	        {
	            return ans;
	        }
	        else
	        return -1;
	    }
	    public int min(int a,int b)
	    {
	        if(a<=b) return a;
	        else return b;
	    }
	

}
