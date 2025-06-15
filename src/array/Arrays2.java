package array;
/*
 * ascending order and sum operation
 */

public class Arrays2 {

	public static void main(String[] args) {
		
			int a[]= {20,15,30,50};
			
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++ ) {
					
					if(a[i]>a[j])  //ascending order
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
			
			int sum=0;
			for(int i=0; i<2; i++) {
				sum=sum+a[i];
			}
			System.out.println(sum);

		}

	}




