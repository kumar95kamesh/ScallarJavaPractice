package day14_2DArray;

import java.util.ArrayList;

public class GenerateSprialMatrix {
	//Given a in A generate a squre matrix filled with element 1 to A^2 in spiral form
//	[1 2 3 
//	 8 9 4
//	 7 6 5]

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class Solution {
	    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
	        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
	        
	        int row=0,col=0;
	        int count=1;
	        for(int i=0;i<A;i++)
	        {
	            ArrayList<Integer> innerA=new ArrayList<Integer>();
	            for(int j=0;j<A;j++)
	            {
	                innerA.add(0);
	            }
	            a.add(innerA);
	        }
	        
	        while(A>1)
	        {
	            for(int i=1;i<A;i++)
	            {
	                a.get(row).set(col,count);
	                col++;
	                count++;
	            }
	            for(int i=1;i<A;i++)
	            {
	                a.get(row).set(col,count);
	                row++;
	                count++;
	            }
	            for(int i=1;i<A;i++)
	            {
	                a.get(row).set(col,count);
	                col--;
	                count++;
	            }
	            for(int i=1;i<A;i++)
	            {
	                a.get(row).set(col,count);
	                row--;
	                count++;
	            }
	            row++;
	            col++;
	            A-=2;
	        }
	        if(A==1)
	        {
	            a.get(row).set(col,count);
	        }
	        return a;
	    }
	}


}
