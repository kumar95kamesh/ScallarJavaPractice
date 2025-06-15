package day5CarryFwdSubArray;

import java.util.ArrayList;

public class Return2DListOfSubArrays {

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
