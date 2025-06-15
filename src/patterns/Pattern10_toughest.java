package patterns;

import java.util.Scanner;

public class Pattern10_toughest {

	public static void main(String[] args) {
//		For example if N = 5 then pattern will be like:
//
//			*________* // 8 spaces
//
//			**______** // 6 spaces
//
//			***____*** // 4 spaces
//
//			****__**** // 2 spaces
//
//			********** // 0 spaces
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<=i;j++)
	            System.out.print("*");
	            for(int k=1;k<=2*n-2*i-2;k++)
	            System.out.print(" ");
	            for(int l=0;l<=i;l++)
	            System.out.print("*");
	            System.out.println();
	        }

	}

}
