package day14_2DArray;

import java.util.ArrayList;

public class TotalSumOfSubMatrices {
	//find total sum of all possible sub matrices

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int sum(ArrayList<ArrayList<Integer>> A) {
	  //find no of all possible sub matrix in which a element is considered multiply that element with no of orrucance so it will be total of that particular element in all sub matrixex
    int r=A.size();//row
    int c=A.get(0).size();//column
    int total=0;
     for(int i=0;i<r;i++)
     {
         for(int j=0;j<c;j++)
         {
            int ele= A.get(i).get(j);
            int occurance=(i+1)*(j+1)*(r-i)*(c-j);//all are no. of rows
            int one_Element_Sum=ele*occurance;
             total+=one_Element_Sum;
         }
     }
     return total;
	}
 }


