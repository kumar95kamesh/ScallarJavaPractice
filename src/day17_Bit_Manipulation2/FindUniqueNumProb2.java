package day17_Bit_Manipulation2;

import java.util.List;

//find unique number other repeats twice
public class FindUniqueNumProb2 {
	  public int singleNumber(final List<Integer> A) {
	        int ans=0;
	        for(int i=0;i<A.size();i++)
	        {
	            ans=ans^A.get(i);
	        }
	        return ans;
	    }
}
