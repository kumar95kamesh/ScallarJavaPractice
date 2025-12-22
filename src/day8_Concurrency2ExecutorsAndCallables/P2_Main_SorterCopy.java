package day8_Concurrency2ExecutorsAndCallables;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * 
 * This is just copy of sorter main class for understanding new concept
 * 
 * 
 */

public class P2_Main_SorterCopy {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Integer> list=List.of(8,4,8,2,7,4,9);
		
		//to run we need executor service
//		ExecutorService es=Executors.newFixedThreadPool(2); 
		/**suppose in upper line we create pool size of 1 only then in sorter class left side
		 * and right side both will ask for separate thread but there is only 1 so both will fight
		 * and merger will wait for complete of these tasks but they will never get executed
		 * this is some deadlock situation.. so  better create cache pool instead of fixed
		 */
		
		ExecutorService es=Executors.newCachedThreadPool();//it will create new thread according to requirement.
		
		P2_Sorter sorter=new P2_Sorter(list);
		Future<List<Integer>> listFuture = es.submit(sorter);
		List<Integer> ans = listFuture.get();
		System.out.println(ans);
		
		es.shutdown();
	}

}
