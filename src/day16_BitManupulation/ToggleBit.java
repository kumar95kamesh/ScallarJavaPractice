package day16_BitManupulation;

//You are given two integers A and B.
//If B-th bit in A is set, make it unset.
//If B-th bit in A is unset, leave as it is.
//Return the updated A value.

public class ToggleBit {
	public int solve(int A, int B) {
        //check if Bth bit in A is set
        if((A&(1<<B))!=0)
        {
// now unset Bth bit mean toggle that bit toggle so baki k bits same rhe only Bth change ho
            A=(A^(1<<B));
        }
        return A;
    }
}
