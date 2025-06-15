package patterns;

public class Pattern1_StaircaseWithNumber
{
//	print
//	*
//	*2
//	*2*
//	*2*4
//	*2*4*
//	*2*4*6
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n; i++) 
		{
			for(int j=0;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else {
					System.out.print(j+1);
				}
			}
			System.out.println();
		}
	}
}
