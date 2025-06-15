package patterns;

public class Pattern4_InvertedStairCaseWithDash {

	public static void main(String[] args) {
//		print 
//		*---*
//		*--*
//		*-*
//		**
		int n=4;
		for(int i=0;i<n;i++)
		{
				System.out.print("*");
				for(int k=0;k<n-i-1;k++)
				System.out.print("-");
				System.out.println("*");
		}

	}

}
