package day13_Array1D;

import java.util.ArrayList;

import java.util.ArrayList;

public class DistributeInBeggers {
//	There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot.
//	When the devotees come to the temple, they donate some amount of coins to these beggars. Each 
//	devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars 
//	sitting next to each other.
//	Given the amount P donated by each devotee to the beggars ranging from L to R index, 
//	where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the
//	day, provided they don't fill their pots by any other means.
//	For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B
//	e.g. A = 5, B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]] Output : 10 55 45 25 25
//	
//	expalnation
//	First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot
//	after first devotee: [10, 10, 0, 0, 0]Second devotee donated 20 coins to beggars ranging from 2
//	to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]Third devotee 
//	donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third 
//	devotee: [10, 55, 45, 25, 25]

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
		int n=B.size();
		// ek array list bna  lete h jisme kis bikhari ko kitna diya wo store kr lenge return bhi to krna h
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<A;i++)
		{ 
			al.add(0);
		}
		for(int i=0;i<n;i++)
		{
			int start=B.get(i).get(0)-1;//bikhari k numbers 1 se start honge
			int end=B.get(i).get(1)-1;//bikhari k numbers 0 se bde hi honge
			int money=B.get(i).get(2);
			//ab money from start se sare bikhari ko money dedo fir end k baad se -ve krke wapas lelo
			//apn ko bs mark krna h ki kha se kya add krna h and kya subtract krna h
			int s1=al.get(start);
			int add=s1+money;
			al.set(start, add);
			//ab end k baad k sare bikhari se lena bhi to h kuki pese sirf start se end walo ko diye h
			if(end<A-1)
			{
				int ele=al.get(end+1);
				int sub=ele-money;
				al.set(end+1, sub);
			}
		}
		// ab array list me marking to kr di pr sbka psum nikal do taki kis kisko kitna diya sb aa jaye
		for(int i=1;i<A;i++)
		{
			int pre=al.get(i-1);
			int ith=al.get(i);
			int add=pre+ith;
			al.set(i, add);
		}
		return al;
    }

}
