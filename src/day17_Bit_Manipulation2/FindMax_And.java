package day17_Bit_Manipulation2;

import java.util.ArrayList;

//Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j].
//1 <= len(A) <= 105
//1 <= A[i] <= 109

public class FindMax_And {
	  public int solve(ArrayList<Integer> A) {
	/**
	 *  there is a mistake somewhere correct it.        
	 */
	        for(int i=31;i<=0;i--)//left most bit se check krenge
	        {
	            ArrayList<Integer> al=new ArrayList<Integer>();
	            for(int j=0;j<A.size();j++)
	            {
	                if(((A.get(j)>>i)&1)!=0)//set bits walie hi ese pairs honge jika and max hoga
	                {
	                    al.add(A.get(j));//particular bit ki position pr kine numbers h jinka bit set h
	                }   
	               
	            }   
	             if(A.size()>=2) //agar count >=2 hue and kisi ka bit unset h to us num ko remove kr skte h kuki agar cnt hi 2 s km hue to pairs hi nhi bnenge
	                {
	                    A=al;  
	                }                  
	        }
	        
	      int ans=A.get(0) & A.get(1);
	        return ans;
	    }

}
