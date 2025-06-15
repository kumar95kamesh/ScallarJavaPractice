package array;
/*
 * descending order
 */

public class ArraysTest {

	public static void main(String[] args) {
		int a[]= {20,15,30,50};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++ ) 
			{
				if(a[i]<a[j]) // descending order
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(a[1]);  // second largest digit
		System.out.println(a[a.length-2]);

	}

}
