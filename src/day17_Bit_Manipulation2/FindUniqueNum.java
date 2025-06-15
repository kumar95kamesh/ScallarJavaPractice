package day17_Bit_Manipulation2;

import java.util.List;

// find a unique number other numbers repeats thrice
public class FindUniqueNum {
	  public int singleNumber(final List<Integer> A) {
	       int ans=0;
	       for(int i=0;i<64;i++)
	       {
	           int cnt=0;
	           for(int j=0;j<A.size();j++)
	           {
	               //take and calculate the ith bit of every element 
	               int ele=A.get(j);
	               if((ele&(1<<i))!=0)  cnt++;      //agar bit set h to
	           }
	           //3 times repeat h to 
	           if(cnt%3!=0) //agar bit 3x nhi h mean wo thrice nhi h to use set kro kyki wo bit unique wale ka h
	           {
	               ans=ans|(1<<i);
	           }
	       }
	       return ans;
	    }
}
