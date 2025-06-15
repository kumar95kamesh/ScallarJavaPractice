package day12Dsa;

public class Problem1ByTeacher 
{
//	Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
//	Find and return the length of the longest consecutive 1’s that can be achieved.
//			For Example
//
//			Input 1:
//			    A = "111000"
//			Output 1:
//			    3			

	public static void main(String[] args) {
		int [] arr=new int[5];
		arr[0]=1;
		arr[1]=0;
		arr[2]=1;
		arr[3]=0;
		arr[4]=1;
		int ans = mtd(arr);
		System.out.println(ans);
	}
	public static int mtd(int [] arr) 
	{
		
		int max_one=0;
		int total_one=0;
		int n=arr.length;
		//find total number of one's
		for(int i=0;i<n;i++)
		{
			if(arr[i]==1)
			total_one++;
		}
		
		//agar total_one arr ki length k brabar hue to wo hi ans ho jayega
		if(total_one==n)
			return total_one;
		
		//otherwise zero ki find kro or usk left and right chle jao
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				int left_one = 0,right_one=0;
				int k=i-1;
				int j=i+1;
				//right me kitne 1 h o ke wo dkhna h
				while(j<n && arr[j]==1)
				{
					right_one++;
					j++;
				}
				//left me kitne 1 h o ke wo dkhna h
				while(k>=0 && arr[k]==1)
				{
					left_one++;
					k--;
				}
				//agar left and right ka total == jitne bhi 1 available h array me to wo hi ans ho
				//jayega kuki ab to koi 1 bacha hi nhi
				if(left_one+right_one==total_one)
				{
					max_one=max(max_one, left_one+right_one);
				}
				else
				{
					//fir to compare krna hoga...jitne bhi 0 ke left and right me 1 h unka
					//sum kro and usme 1 add kr lo kuki ek zero ki jagah doora 1 bhi to lega
					//eg; 11101101 to yha last wala 0 1 se swap hoga na to ans will be
					//left +right+1 = 3+2+1=6..resultant like 11111100
					max_one=max(max_one,left_one+right_one+1);
				}
			}
			
		}
		
		return max_one;
		
	}
	
	public static int max(int m1,int m2)
	{
		if(m1>m2)
		{
			return m1;
		}
		else
		{
			return m2;
		}
	}
	
	 

}
