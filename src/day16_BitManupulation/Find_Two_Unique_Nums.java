package day16_BitManupulation;

import java.util.ArrayList;

//Given an array of positive integers A, two integers appear only once, and all the other 
//integers appear twice.
//Find the two integers that appear only once.
//Note: Return the two numbers in ascending order.

public class Find_Two_Unique_Nums {
	 public ArrayList<Integer> solve(ArrayList<Integer> A) {
	        ArrayList<Integer> al=new ArrayList<Integer>();
	        int num1=0,num2=0;
	        //find xor of all the nums
	        int xorVal1=xorVal(A);
	        //now check first set bit from right
	        int position=0;
	        for(int i=0;i<64;i++)
	        {
	           if((xorVal1 & (1<<i))!=0)
	           {
	           position=i;
	           break;
	           }
	        }
	        //now ith bit is set so either it is num1 or num2
	        for(int i=0;i<A.size();i++)
	        {
	            if((A.get(i)&(1<<position))!=0)//us position pr set wali sari value ko alag kr rhe h
	            {
	                num1=num1^A.get(i);//ab ye wala case sari values repeated h except one value wala h
	            }
	            else//agar us position pr unset bits wale numbers ko seperate kr rhe h
	            {
	                num2=num2^A.get(i);//baki sare to repeated h bs us ek number k
	            }
	        }
	        //assending order
	     if(num1<num2)   
	    {
	        al.add(num1);
	        al.add(num2);
	    }
	    else
	    {
	        al.add(num2);
	        al.add(num1);
	    }
	        return al;

	    }

	    public int xorVal(ArrayList<Integer> al)
	    {
	        int ans=0;
	        for(int i=0;i<al.size();i++)
	        {
	            ans=ans^al.get(i);
	        }
	        return ans;
	    }

}
