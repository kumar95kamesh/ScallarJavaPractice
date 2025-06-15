package day15InterviewProblemsArray3;

import java.util.ArrayList;
import java.util.Collections;

public class FindFirstMissingNumCopyScaller {
//	Given an unsorted integer array, A of size N. Find the first missing positive integer.
//	Note: Your algorithm should run in O(n) time and use constant space.

	// somewhere mistake
		    public int firstMissingPositive(ArrayList<Integer> A) {
		        int n = A.size();
		        for (int i = 0; i < n; i++) {
		            if (A.get(i) > 0 && A.get(i) <= n) {
		                int pos = A.get(i) - 1;
		                if (A.get(pos) != A.get(i)) {
		                    Collections.swap(A, pos, i);
		                    i--;
		                    // We are doing i-- as we have swapped i'th element with pos'th 
		                    // element and we might not have processed the pos'th element.
		                }
		            }
		        }
		        for (int i = 0; i < n; i++) {
		            if (A.get(i) != i + 1) 
		                return (i + 1);
		        }
		        return n + 1;
		        }
}
