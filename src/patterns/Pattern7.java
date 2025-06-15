package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
//		1
//		1_
//		1_3
//		1_3_
//		1_3_5
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	          for(int j=0;j<=i;j++)
	          { 
	              if(j%2==0)
	               System.out.print(j+1); 
	               if(j%2!=0 )
	                System.out.print("_"); 
	          }    
	                
	           System.out.println();
	        }
	     

	}

}
