package javaPrograms;

import java.util.Scanner;

public class ReverseArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
	        int n=sc.nextInt();
	        int[] arr=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int k=n/2;
	        for(int i=0;i<k;i++)
	        {
	            int a=arr[i];
	            arr[i]=arr[n-i-1];
	            arr[n-i-1]=a;
	        }
	        for(int i=0;i<n;i++)
	        {
	        	System.out.println(arr[i]);
	        }
	}

}
