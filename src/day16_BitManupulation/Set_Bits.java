package day16_BitManupulation;

//You are given two integers A and B.
//Set the A-th bit and B-th bit in 0, and return output in decimal Number System

public class Set_Bits {
	  public int solve(int A, int B) {
	        int n=0;
	        n=n|(1<<(A)); //set Ath bit
	        n=n|(1<<(B)); //set Bth bit
	        return n;
	    }

}
