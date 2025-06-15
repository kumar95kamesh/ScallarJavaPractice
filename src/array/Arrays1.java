package array;

/*
 * descending order and sum operation
 */

public class Arrays1 {

	public static void main(String[] args) {
		int a[]= {20,15,30,50};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++ ) {
				
				if(a[i]<a[j]) 
				{
					//bigger wale to extract krke swap kr diya
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			}
		int sum=0;
		for(int i=0; i<2; i++) 
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
