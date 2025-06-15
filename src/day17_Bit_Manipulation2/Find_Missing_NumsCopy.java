package day17_Bit_Manipulation2;

import java.util.ArrayList;

//Given an array A of length N where all the elements are distinct and are in the range [1, N+2].
//Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.
//and sort them then return

public class Find_Missing_NumsCopy {
	public class Solution {
		 public int[] solve(int[] A) {
		        int n = A.length;
		        int[] ans = new int[2];
		        int XOR = 0;
		        for(int i = 0; i < n; i++){
		            XOR ^= A[i];
		        }
		        for(int i = 1; i <= n + 2; i++){
		            XOR ^= i;
		        }
		        // XOR has the bitwise XOR of two missing elements. Any set bit 
		        // in it must be set in one and unset in the other missing number
		      
		        // We get the rightmost set bit
		        /**
		         * only is part k liye y solution copy kiya h baki sara explanation first wale m hi h
		         */
		        int rightmost_set_bit = XOR & ~(XOR - 1);
		        
		        // Divide elements in two sets by comparing rightmost
		        // set bit of XOR with bit at same position in each element.
		        int x = 0, y = 0;
		        for (int i = 0; i < n; i++){
		            if((A[i] & rightmost_set_bit) > 0)
		                x = x ^ A[i]; 
		            else
		                y = y ^ A[i];
		        }
		        for(int i = 1; i <= n + 2; i++){
		            if ((i & rightmost_set_bit) > 0)
		                x = x ^ i;
		            else
		                y = y ^ i; 
		        }
		        
		        ans[0] = Math.min(x, y);
		        ans[1] = Math.max(x, y);
		        return ans;
		    }
	}


}
