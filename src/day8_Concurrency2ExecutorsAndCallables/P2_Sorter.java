package day8_Concurrency2ExecutorsAndCallables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class P2_Sorter implements Callable<List<Integer>> {//what data type will return callable
	List<Integer> arrayToSort;
	
	public P2_Sorter(List<Integer> arrayToSort) {//to feed the data.
		this.arrayToSort=arrayToSort;
	}
	

	@Override
	public List<Integer> call() throws Exception {//method from callable interface
		if(arrayToSort.size()<=1) {
			return arrayToSort;
		}
		
		//find mid to sort
		int mid=arrayToSort.size()/2;
		
		List<Integer> leftArray=new ArrayList<Integer>();
		List<Integer> rightArray=new ArrayList<Integer>();
		
		//add mid part to each array
		
		for(int i=0;i<mid;i++) {
			leftArray.add(arrayToSort.get(i));
		}
		
		for(int i=mid;i<arrayToSort.size();i++) {
			rightArray.add(arrayToSort.get(i));
		}

		//now use method recursion to sort whole array
		P2_Sorter leftsorter=new P2_Sorter(leftArray);
		P2_Sorter rightsorter=new P2_Sorter(rightArray);
		
		//Runnable -> execute
		//callable -> submit
		
		//Now to run both the part in different threads we have to submit it (callable)
		ExecutorService es=Executors.newFixedThreadPool(2);//we have two threads only so
		Future<List<Integer>> leftFuture = es.submit(leftsorter);//this is why we used callable because it returns something.
		Future<List<Integer>> rightFuture = es.submit(rightsorter);//for callable we submit it.
		/**
		 * We can not merge both just now.. because left part will run in one thread, right will run in another
		 * and whole code will run in some thread.. so to make sure if left and right part have done their job
		 * so line leftSorted and rightSorted will get executed only if upper two completes
		 */
		//merger both the results
		List<Integer> sortedLeftArray=leftFuture.get();//this will get executed when all the threads of left executed.
		List<Integer> sortedRightArray=rightFuture.get();
		
		//code of merge
		int i=0;
		int j=0;
		
		List<Integer> sortedArray=new ArrayList<Integer>();
		
		while(i<sortedLeftArray.size()&&j<sortedRightArray.size()) {
			if(sortedLeftArray.get(i)<=sortedRightArray.get(j)) {
				sortedArray.add(sortedLeftArray.get(i));
				i+=1;
			}
			else {
				sortedArray.add(sortedRightArray.get(j));
				j+=1;
			}
		}
		while(i<sortedLeftArray.size()) {
			sortedArray.add(sortedLeftArray.get(i));
			i+=1;
		}
		while(j<sortedRightArray.size()) {
			sortedArray.add(sortedRightArray.get(j));
			j+=1;
		}
		
		return sortedArray;
		
	}

}
