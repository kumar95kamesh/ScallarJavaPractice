package day17_Bit_Manipulation2;

import java.util.ArrayList;

//Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j].
//1 <= len(A) <= 105
//1 <= A[i] <= 109

public class FindMax_And_Scallar {
	public int solve(ArrayList<Integer> A) {
        ArrayList < Integer > v = new ArrayList < Integer > ();
        for (int it : A) 
            v.add(it);
        for (int i = 29; i >= 0; i--) {
            // create a set of elements with the i-th bit set
            ArrayList < Integer > v2 = new ArrayList < Integer > ();
            for (int it : v)
                if ((it & (1 << i)) != 0) 
                    v2.add(it);
            if (v2.size() >= 2) {
                v.clear();
                for (int it: v2) 
                    v.add(it);
            }
        }
        return (int)(v.get(0) & v.get(1));
    }
}
