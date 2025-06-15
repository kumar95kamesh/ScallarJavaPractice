package day5CarryFwdSubArray;

import java.util.ArrayList;

public class Return2DSubArray {
//	You are given an array A of N integers.
//	Return a 2D array consisting of all the subarrays of the array
//	Note : The order of the subarrays in the resulting 2D array does not matter.
//	e.g. A = [1, 2, 3]
//	ans [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        int n=A.size();
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
            	ArrayList<Integer> a=new ArrayList<Integer>();
                for(int k=i;k<=j;k++)
                {
                    a.add(A.get(k));
                }
                al.add(a);
            }
        }
        return al;
    }

}
