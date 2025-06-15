package day12Dsa;

import java.util.ArrayList;

public class Problem2 {
//			lecture ka last quest h
//			You are given a 2D integer matrix A, make all the elements in a row or column zero
//			if the A[i][j] = 0.	Specifically, make entire ith row and jth column zero
	
	public static void main(String[] args) {
		
	}
	 public int[][] solve(int[][] A) 
	 {
	        int n = A.length, m = A[0].length;
	        //yha row wise check kr rhe h
	    	for(int i = 0; i < n; i++){
	    		int flag = 0;
	    		//kisi bhi i k liye j check kr rhe h
	    		for(int j = 0; j < m; j++)
	    		{
	    			if(A[i][j]==0)flag = 1;
	    		}
	    		//flag=1 mean us row me koi to zero h to poori row ko zero krna pdega
	    		//to zero na krk abhi bs mark kr rhe h baad me sare marked elements zero kr denge
	    		//yha quest me diya h ki sare elements +ve h to mark krne k liye sbko -1 bna dete h
	    		if(flag == 1)
	    		{
	    			for(int j = 0; j < m; j++)
	    			{
	    				if(A[i][j] != 0) A[i][j] = -1;
	    			}
	    		}
	    	}
	    	//yha column wise check kr rhe h...chahe to merge bhi kr skte h pr ise smjhna aasan h
	    	for(int j = 0; j < m; j++){
	    		int flag = 0;
	    		for(int i = 0; i < n; i++){
	    			if(A[i][j]==0)flag = 1;
	    		}
	    		if(flag == 1){
	    			for(int i = 0; i < n; i++){
	    				if(A[i][j] != 0) A[i][j] = -1;
	    			}
	    		}
	    	}
	    	for(int i = 0; i < n; i++){
	    		for(int j = 0; j < m; j++){
	    			if(A[i][j] == -1)A[i][j] = 0;
	    		}
	    	}
	    	return A;
	    }

}
