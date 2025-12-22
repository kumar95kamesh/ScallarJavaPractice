package day8_Concurrency2ExecutorsAndCallables;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class P2_Main_Sorter {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Integer> list=List.of(8,4,8,2,7,4,9);
		
		//to run we need executor service
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		P2_Sorter sorter=new P2_Sorter(list);
		Future<List<Integer>> listFuture = es.submit(sorter);
		List<Integer> ans = listFuture.get();
		System.out.println(ans);
		
		es.shutdown();
	}

}
