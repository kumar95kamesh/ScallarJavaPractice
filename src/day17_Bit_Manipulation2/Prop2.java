package day17_Bit_Manipulation2;

//You are given an array of integers A of size N.
//The value of a subarray is defined as BITWISE OR of all elements in it.
//Return the sum of value of all subarrays of A % 109 + 7.

public class Prop2 {
	public int solve(int[] A) {
        int n = A.length;
        int[] idx = new int[32];
        long ans = 0;
        for (int i = 1; i <= n; ++i) {
            long tmp = A[i - 1];
            for (int j = 0; j <= 31; ++j) {
                long pw = 1 << j;
                if ((tmp & pw) != 0) { //if jth bit is set
                    ans += pw * i; // add its contribution in ans for all subarrays ending at index i
                    idx[j] = i; // store the index for next elements
                } else if (idx[j] != 0) // if jth bit is not set
                {
                    ans += pw * idx[j]; // add its contribution in ans for all subarrays ending at index i using 
                } // the information of last element having jth bit set
            }
        }
        return (int)(ans % 1000000007);
    }

}
