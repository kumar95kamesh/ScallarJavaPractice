package day3IntroductionToArrays;

import java.util.ArrayList;

public class SwipeBetweenRange {
//	Given an array A of N integers and also given two integers B and C.
//	Reverse the elements of the array A within the given inclusive range [B, C].

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
		 int i=B;
		 int j=C;
	      while(i<j)
	      {
	    	  int temp=A.get(i);//i=temp
	    	  A.set(i, A.get(j));//i=j
	    	  A.set(j, temp);//j=temp
	      }
	      return A;
	    }

}
