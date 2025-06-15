package day16_BitManupulation;

public class Count_Number_Of_SetBits {
	
	public int solve(int A) {
		int count = 0;
		while (A > 0) {
			if ((A & 1) != 0)
				count++;
			A = A >> 1;
		}
		return count;
	}

}
