package day19_Recursion2;

import java.util.ArrayList;

/**
 * You have the following constraints:

Only one disk can be moved at a time.
A disk is slid off the top of one tower onto another tower.
A disk cannot be placed on top of a smaller disk.
You have to find the solution to the Tower of Hanoi problem.
You have to return a 2D array of dimensions M x 3, where M is the minimum number of moves needed to solve the problem.
In each row, there should be 3 integers (disk, start, end), where:

disk - number of the disk being moved
start - number of the tower from which the disk is being moved
end - number of the tower to which the disk is being moved
 */
public class TowerOfHanoiProblem {
	public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
	       ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
	    TowerOfHanoi(A,1,2,3,al);
	    return al;

	    }
	    public static void TowerOfHanoi(int N,int src,int aux,int dest,ArrayList<ArrayList<Integer>> al)
	    {
	        if(N==0) return ;
	        TowerOfHanoi(N-1,src,dest,aux,al);
	        ArrayList<Integer> temp=new ArrayList<Integer>();
	        temp.add(N);
	        temp.add(src);
	        temp.add(dest);
	        al.add(temp);
	        TowerOfHanoi(N-1,aux,src,dest,al);

	    }

}
