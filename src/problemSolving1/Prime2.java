package problemSolving1;

public class Prime2 {
	/**
	 * Question :- print the numbers of prime less then the number A
	 * @param args
	 */

	public static void main(String[] args) {
		int c = countFactors(4);
		System.out.println(c);
	}

	public static int countFactors(int A) {
		
		int prime = 0;
		for (int i = 2; i <= A; i++) {
			int factor = 0;
			for (int j = 1; j <= Math.sqrt(i); j++)// sq root likhna
			{
				if (j * j == i) {
					factor++;
				} else if (i % j == 0) // else if is compulsory otherwise i=j hoga wha doosri wali
										// condition bhi to satisfy hogi and factor+=2 wala bhi ho jayega
				{
					factor += 2;
				}
			}
			if (factor == 2) {
				prime++;
			}
			
		}
		return prime;
	}

}
