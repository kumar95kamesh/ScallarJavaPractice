package day18_Recursion;

public class PrintAscendingNaturalNum {

	/**
	 * Given N now print all the numbers from 1 to N
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
			print(N-1);  // is point pr aate hi new stack call hoga.. and jb tk 1 nhi aa jata new stacks bnte rhenge
							// 1 aane k baad wapas return honge functions fir print honge sb.. check notes
			System.out.println(N);
		}
	}

}
