package javaPrograms;

import java.util.Scanner;

public class PerfactNumber {

	public static void main(String[] args) {
//		Que:- t number of test cases and n is the number in each test case print if a 
//		Number is perfact or not
		 Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        int total=0;
	        for(int j=1;j<=t;j++)
	        {
	            int n=sc.nextInt();
	            for(int i=1;i<n;i++)
	            {
	                if(n%i==0)
	                {
	                    total=total+i;
	                }
	            }
	            if(total==n)
	            {
	                System.out.println("YES");
	            }
	            else{
	                System.out.println("NO");
	            }
	            total=0; //otherwise new loop me wo hi initialize ho jayega
	        }
	        
	}

}
