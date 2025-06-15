package day13_Array1D;

import java.util.ArrayList;
import java.util.List;

public class WaterTrappingFromClass {
//	Given a vector A of non-negative integers representing an elevation map where the width of each 
//	bar is 1, compute how much water it is able to trap after raining.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int trap(final List<Integer> A) {
		 int n = A.size();
		 int ans=0;
		 List<Integer> psum_left_Max=new ArrayList<Integer>();
		 List<Integer> psum_Right_Max=new ArrayList<Integer>();
		
		 List<Integer> lMax = psumLeftMax(A, psum_left_Max);
		 List<Integer> rMax = psumRightMax(A, psum_Right_Max);
		 for(int i=0;i<n-1;i++)
		 {
			 int a=lMax.get(i);
			 int b=rMax.get(i);
			 int water=min(a, b)-A.get(i);
			 if(water>0)
			 {
				 ans+=water;
			 }
		 }
		 return ans;
	 }
	 
	 public static List<Integer> psumLeftMax(List<Integer> A,List<Integer> psum )
	 {
		 //Basically psum me left max store kr rhe h
		 int n=A.size();
		 for(int i=0;i<n;i++)
		 {
			 psum.add(0);
		 }
		 if(n>1)//constraint is 1-1000 so there will be min 1 element mean 44 no. will be failed if there is only 1 ele
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
			 if(n>1)//kuki constraint 1-1000 tk h agar 1 hi element hua to usm last wala to hoga pr second last wala nhi hoga
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
		 
		 public static int min(int a,int b)
		 {
			 if(a>=b)
			 {
				 return b;
			 }
			 else {
				return a;
			}
		 }
}
