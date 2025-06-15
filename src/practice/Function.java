package practice;

import java.util.ArrayList;
import java.util.List;

public class Function {

	public static void main(String[] args) {
		int [] arr= {4,2,5,7,4,2,3,6,8,2,3};
		List<Integer> l=new ArrayList<Integer>();
		
		for(int a:arr)
		{
			l.add(a);
		}
		List<Integer> psum=new ArrayList<Integer>(arr.length);
		List<Integer> p = psumLeftMax(l, psum);
		for(int i=0;i<p.size();i++)
		{
			System.out.println(p.get(i));
		}
	}
	 public static List<Integer> psumLeftMax(List<Integer> A,List<Integer> psum )
	 {
		 //Basically psum me left max store kr rhe h
		 int n=A.size();
		 for(int i=0;i<n;i++)
		 {
			 psum.add(0);
		 }
		 psum.set(1,A.get(0));//list ka phla wala left max hoga..kuki wo hi left m h bs
		 for(int i=1;i<n-1;i++)
		 {
			 if(A.get(i)>psum.get(i))
			 {
				 psum.set(i+1, A.get(i));//agar list ki value left max se bdi hui to wo hi left max hogi
			 }
			 else
			 {
				 psum.set(i+1, psum.get(i));
			 }
		 }
		 return psum;
	 }

	public static int[] leftMax()
	{
		int [] arr= {4,2,5,7,4,2,3,6,8,2,3};
		int n=arr.length;
		int [] psumlef=new int[n];
		psumlef[0]=0;
		psumlef[1]=arr[0];
		for(int i=1;i<n-1;i++)
		{
			if(arr[i]>psumlef[i])
			{
				psumlef[i+1]=arr[i];
			}
			else
			{
				psumlef[i+1]=psumlef[i];
			}
		}
		return psumlef;
		
	}
	public static List<Integer> psumRightMax(List<Integer> A,List<Integer> psum )
	 {
		 //Basically psum me Right max store kr rhe h
		 int n=A.size();
		 //set size of psum
		 for(int i=0;i<n;i++)
		 {
			 psum.add(0);
		 }
		 psum.set(n-1,0);//last will be zero bcoz usk right m koi max nhi h
		 psum.set(n-2,A.get(n-1));//list ka last wala right max hoga..kuki wo hi right m h bs
		 for(int i=n-1;i>=1;i--)
		 {
			 if(A.get(i)>psum.get(i))
			 {
				 psum.set(i-1, A.get(i));//agar list ki value right max se bdi hui to wo hi right max hogi
			 }
			 else
			 {
				 psum.set(i-1, psum.get(i));
			 }
		 }
		 return psum;
	 }
}
