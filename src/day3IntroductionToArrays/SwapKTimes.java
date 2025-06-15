package day3IntroductionToArrays;

import java.util.ArrayList;

public class SwapKTimes {
//	Given an integer array A of size N and an integer B, you have 
//	to return the same array after rotating it B times towards the right.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		  
		  int n=A.size();
		//B times rotate krna h agar total elements se bhi jyada rorate ki bola to fir 
      //eg. total element =5 and 13 baar rotate to mean 2 chakkar+ 3 baar extra
		  B=B%n;
		  
		  // reverse from 0-n-1
        reverse(A,0,n-1);
        // reverse from 0-(B-1)
          reverse(A,0,B-1);
        // reverse from B-(n-1)
          reverse(A,B,n-1);
          return A;
	    }
	  public ArrayList<Integer> reverse(ArrayList<Integer> A,int i,int j)
	  {
		  while(i<j)
		  {
          int num=A.get(j);

			int temp=A.get(i);
			 A.set(i,num);
			 A.set(j,temp);
			i++;
			j--;  
		  }
		  return A;
	  }

}
