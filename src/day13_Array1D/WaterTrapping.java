package day13_Array1D;

import java.util.ArrayList;
import java.util.List;

public class WaterTrapping {
//	Given a vector A of non-negative integers representing an elevation map where the width of each 
//	bar is 1, compute how much water it is able to trap after raining.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int trap(final List<Integer> A) {
		// hint me jo ans h usk according... class me alag trika btaya h
		 int n=A.size();
		 int left=0;
		 int right=n-1;
		 int left_Max=0,right_Max=0;
		 int res=0;
		 //ab yha approach y lga rhe h ki left side se chlenge to left me next wali wall agar phli
		 //wali se bdi hui to wo pani to rokegi nhi pr use ab apn left_Max bna denge or agar choti hui
		 //to wo pani rokegi mean left_Max - left k brabar pani rokegi or ese hi single-single candle
		 //pr kitna pani store hua wo calculate kr lo same goes from right side
		 while(left<=right)//beech wali bhi to dkhnge agar usne pani store kiya to fir basically yha list k aadhe aadhe me check kr rhe h
		 {
			// When height of left side is lower, calculate height of water trapped in left bin else calculate for right bin
			 if(A.get(left)<A.get(right))
			 {
				 if(A.get(left)>=left_Max)//to pani store nhi hoga pr left max ko initialize krenge
				 {
					 left_Max=A.get(left);
				 }
				 else//pani store krenge
				 {
					res+=left_Max-A.get(left);
				 }
				 left++;
			 }
			 else
			 {
				 if(A.get(right)>=right_Max)//initialize
				 {
					 right_Max=A.get(right);
				 }
				 else
				 {
					 res+=right_Max-right;
				 }
				 right--;
			 }
		 }
		 return res;
	 }
	 
	 
	 // hit ka solution
	 public int trap(final int[] A) {
	        int n = A.length;
	        int left = 0; 
	        int right = n - 1;
	        int res = 0;
	        int maxleft = 0, maxright = 0;
	        while(left <= right){ 
	            // When height of left side is lower, calculate height of water trapped in left bin else calculate for right bin
	            if(A[left] <= A[right]){
	                if(A[left] >= maxleft) 
	                    maxleft = A[left]; //This index wont store any water as there is no index towards the left whose height is greater than this.
	                else 
	                    res += maxleft - A[left];
	                left++;
	            }
	            else{
	                if(A[right] >= maxright) 
	                    maxright = A[right]; //This index wont store any water as there is no index towards the right whose height is greater than this.
	                else 
	                    res += maxright - A[right];
	                right--;
	            }
	        }
	        return res;
	    }

}
