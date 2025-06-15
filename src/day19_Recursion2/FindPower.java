package day19_Recursion2;

public class FindPower {
	/**
	 * Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
	 * @param A
	 * @param B
	 * @param C
	 * @return
	 */
    public int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
 
        if(A == 0)
            return 0;
        if(B == 0)
            return 1;
        long ans = pow(A, B / 2, C);
        ans = (ans * ans) % C;
        if(B % 2 == 1)
            ans = (ans * A);
        ans = (ans + C) % C;
        return (int)ans;
    
    }
}
