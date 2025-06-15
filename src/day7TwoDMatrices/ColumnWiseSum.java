package day7TwoDMatrices;

import java.util.ArrayList;

public class ColumnWiseSum {
//	You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of 
//			original matrix.
//	e.g.  [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
	    
	public static void main(String[] args) {

	}
	 public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
		 ArrayList<Integer> al=new ArrayList<Integer>();
		 int n=A.size();
		 int m=A.get(0).size();
		 for(int i=0;i<m;i++)
		 {
			 int sum=0;
			 for(int j=0;j<n;j++)
			 {
				 sum+=A.get(j).get(i);
			 }
			 al.add(sum);
		 }
		 return al;
	    }

}
