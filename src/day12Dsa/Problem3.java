package day12Dsa;

import java.util.List;

public class Problem3 {
//
//	Given an array of size N, find the majority element. The majority element is the element 
//	that appears more than floor(n/2) times.
//	You may assume that the array is non-empty and the majority element always exists in the array.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int majorityElement(final List<Integer> A) {
	       int n=A.size();
	       int major_index=0;
	       int count=1;
	       for(int i=1;i<n;i++)
	       {
	           if(count==0)
	           {
	               major_index=i;
	               count=1;
	           }
	           else{
	        	   //agar next element same hua to ++
	               if(A.get(major_index)==A.get(i))
	               {
	                   count++;
	               }
	               else{
	                   count--;
	               }
	           }
	         
	       }
	         // check kro ki count n/2 se jyada h ya nhi
	           count=0;
	           for(int i=0;i<n;i++)
	           {
	               if(A.get(i)==A.get(major_index))
	               count++;
	           }
	           if(count>n/2)
	           {
	               return A.get(major_index);
	           }
	           else{
	               return -1;
	           }
	        
	    }

}
