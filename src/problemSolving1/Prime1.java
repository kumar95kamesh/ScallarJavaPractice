package problemSolving1;

public class Prime1 {
	/**
	 * Question :- print the numbers of prime less then the number A
	 * @param args
	 */

	public static void main(String[] args) {
		String c = countFactors(4);
		System.out.println(c);
	}

	public static String countFactors(int n) {
		
		int factor=0;
		for(int i=1;i<=Math.sqrt(n);i++)// sq root likhna
		{
			if(i*i==n)
				{
				factor++;
				}
			else if(n%i==0) //else if is compulsory otherwise i=j hoga wha doosri wali
							//condition bhi to satisfy hogi and factor+=2 wala bhi ho jayega
				{
				factor+=2;
				}
		}
		if(factor==2) {
			return "Prime";
		}
		else {
			return "NOt Prime";
		}
	}
	

}
