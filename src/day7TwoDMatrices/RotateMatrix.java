//package day7TwoDMatrices;
//
//import java.util.ArrayList;
//
//public class RotateMatrix {
////	You are given a n x n 2D matrix A representing an image.
////	Rotate the image by 90 degrees (clockwise).
////	You need to do this in place.
////	Note: If you end up using an additional array, you will only receive partial score.
////	 [
////	    [1, 2],
////	    [3, 4]
////	 ]
////			 Output 1:
////
////				 [
////				    [3, 1],
////				    [4, 2]
////				 ]
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
//		int n=A.get(0).size();//will give column
//		int m=A.size();//will give rows
//		for(int i=0;i<m;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				int temp=A.get(i).get(j);
//				int ele=A.get(j).get(i);
//				A.get(j).set(i, ele);
//				A.get(i).set(j, temp);
//			}
//		}
//		return A;
//		
//    }
//}
//
////https://www.scaler.com/academy/mentee-dashboard/class/176489/assignment/problems/55/?navref=cl_pb_nv_tb
