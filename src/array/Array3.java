package array;
/*
 * ascending order
 */

public class Array3 
{

	public static void main(String[] args) 
	{
			int a[]= {20,15,30,50};
		
		for(int i=0; i<a.length; i++) 
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i]>a[j]) // ascending order
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;				
				}
			}
			
		}
		for(int i=0; i<a.length; i++) 
		{
			System.out.println(a[i]);
		}
		System.out.println(a[1]);  // second smallest number
		System.out.println(a[a.length-2]); // second largest number

	}



	}


