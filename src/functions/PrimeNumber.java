package functions;

public class PrimeNumber {
	public static void main(String[] args) {
		primeNumbers(11);
	}

	public static boolean isPrime(int n) {
		int factor = 0;
		if (n > 2) 
		{
			for (int i = 2; i < n; i++) //3-11
			{
				if(n%i==0) factor++;
				if (factor >= 1)
					return false;
			}
			if (factor == 0)
				return true;
		}
		if (n == 2)
			return true;
		else
			return false;
	}
	
	public static void primeNumbers(int n)
	{
		if(isPrime(n)==true) System.out.println("Prime number");
		else System.out.println("Not prime number");
	}
}
