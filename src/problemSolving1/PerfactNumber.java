package problemSolving1;

public class PerfactNumber {
	/**
	 * Question :- You are given an integer A. You have to tell whether it is a
	 * perfect number or not.
	 * Perfect number is a positive integer which is equal to the sum of its proper
	 * positive divisors.
	 * A proper divisor of a natural number is the divisor that is strictly less
	 * than the number.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int c = perfact(4);
		System.out.println(c);
	}

	public static int perfact(int A) {
		int total = 0;
		for (int i = 1; i < A; i++) {
			if (A % i == 0) {
				total += i;
			}
		}
		if (total == A)
			return 1;
		else
			return 0;
	}

}
