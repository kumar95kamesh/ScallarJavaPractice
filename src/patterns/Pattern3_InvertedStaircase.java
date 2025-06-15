package patterns;

public class Pattern3_InvertedStaircase {

	public static void main(String[] args) {
	//	print 
	//	****
	//	***
	//	**
	//	*
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
