package patterns;

import java.util.Scanner;

public class Pattern9_inversePyramid {

	public static void main(String[] args) {
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            for(int j=1;j<=n-i;j++)
	            {
	            System.out.print(j);
	            if(j!=n-i)
	            System.out.print(" ");
	            }
	            System.out.println();
	        }

	}

}
