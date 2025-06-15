package patterns;

public class Pattern5_Pyramid {

	public static void main(String[] args) {
//		print
//			*
//		   **
//		  ***
//		 ****
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)//for space
				System.out.print(" ");
			for(int k=0;k<i+1;k++)// for star
				System.out.print("*");
			System.out.println();//for new line
		}

	}

}
