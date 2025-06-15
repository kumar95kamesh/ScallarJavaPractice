package day17_Bit_Manipulation2;

import java.util.ArrayList;

//Given an array A of length N where all the elements are distinct and are in the range [1, N+2].
//Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.
//and sort them then return

public class Find_Missing_Nums {
	public class Solution {
	    public ArrayList<Integer> solve(ArrayList<Integer> A) {
	        ArrayList<Integer> al=new ArrayList<Integer>();
	        int List_xor=0;
	        int missing_Nums_xor=0;
	        int num_xor=0;
	        for(int i=0;i<A.size();i++)
	        {
	            //taking xor of the given list
	            List_xor=List_xor^A.get(i);
	        }
	        //ab 1 se n+1 tk k nums ka xor 
	        for(int i=1;i<=A.size()+2;i++)
	        {
	            num_xor=num_xor^i;
	        }
	        //now take xor or num_xor and List_xor to final xor missing nums ka hi hoga
	        missing_Nums_xor=num_xor^List_xor;
	        //ab missing nums ko seperate krna h

	        //get first set bit from right
	        int position=0;
	        for(int i=0;i<64;i++)
	        {
	            if((missing_Nums_xor & (1<<i))!=0)//if set bit
	            {
	                position=i;
	                break;
	            }
	        }

	        //ab us position k basis pr missing nums ko seperate krenge
	        /**
	         * ab y question repeated values m 2 unique nums ko find krne wala ho jayega
	         * pr yha to repeated nums h hi nhi.. to phle to list me 1 to N+2 m 2 nums missing
	         * h to ek to list k nums and ek 1 to N+2 k sare elements consider krenge
	         * ab yha to 2 list ho gyi to seperate krne k liye xor nikalna hoga fir rightmost 
	         * set bit bit us bit k according sari values ko set and unset bit m seperate krenge
	         * pr yha to 2 list ho gyi first to list wali 0 to n-1 and second 1 to n+2 ab y tricky
	         * ho gya to think more.. set bit k according xor nikal lenge and first value ko and second
	         * value ko seperate krenge pr wo shi to hogi nhi to second list jo ko 1 to n+2 h
	         * usm bhi un hi values ka xor nikal lenge to dono lists ko combine krk seperate krne
	         * ki jrurat hi nhi h..
	         */
	        int val1=0, val2=0;
	        for(int i=0;i<A.size();i++)
	        {
	            if((A.get(i)&(1<<position))!=0)//SET BIT
	            {
	                val1^=A.get(i);
	            }
	            else // unset bits
	            {
	                val2^=A.get(i);
	            }
	        }
	        // ab jo bhi values aayi h use 1 to n+2 tk ki values se bhi xor kro tbhi to kuch values double and missing wali unique rhegi
	        for(int i=1;i<=A.size()+2;i++)
	        {
	            if((i&(1<<position))!=0)//set bits
	            {
	                val1^=i;
	            }
	            else
	            {
	                val2^=i;
	            }
	        }

	        if(val1<val2)
	        {
	            al.add(val1);
	            al.add(val2);
	        }
	        else{
	             al.add(val2);
	             al.add(val1);
	        }
	        return al;
	    }
	}


}
