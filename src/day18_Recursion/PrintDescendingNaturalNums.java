package day18_Recursion;

public class PrintDescendingNaturalNums {

	/**
	 * Given N now print all the numbers from N to 1
	 * @param args
	 */
	public static void main(String[] args) {
		print(5);

	}
	
	public static void print(int N)
	{
		if(N==0)
		{
			return;
		}
		else
		{
			System.out.println(N);//phle y print hoga fir new stack bnega
			print(N-1);  
		}
	}

}
