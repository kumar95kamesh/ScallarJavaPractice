package day3IntroductionToArrays;

import java.util.ArrayList;

public class SecondMax {

	public static void main(String[] args) {
		ArrayList<Integer> A =new ArrayList<Integer>();
		int [] arr={13,7,16,18,14,17,18,8,10};
		for(int i=0;i<arr.length;i++)
		{
			A.add(arr[i]);
		}
		int p=solve(A);
		System.out.println(p);
	}
    public static int solve(ArrayList<Integer> A) {
        int secondMax=Integer.MIN_VALUE;
        int firstMax=max(A);
        int n=A.size();
        for(int i=0;i<n;i++)
        {
            int p=A.get(i);
            if(p<firstMax && p>secondMax)
            {
                secondMax=p;
            }
        }
        if(secondMax!=Integer.MIN_VALUE)
        {
            return secondMax;
        }
        return -1;

    }
    public static int max(ArrayList<Integer> A)
    {
        int n=A.size();
        int  max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        { 
            int p=A.get(i);
            if(p>max)
            {
                max=p;
            }
        }
        return max;
    }


}
