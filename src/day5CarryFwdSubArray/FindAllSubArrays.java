package day5CarryFwdSubArray;

public class FindAllSubArrays {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int start_Index=1;
		int end_Index=4;
		for(int i=start_Index;i<=end_Index;i++)
		{
			for(int j=i;j<=end_Index;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
