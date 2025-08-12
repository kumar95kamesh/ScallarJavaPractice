package day8_Concurrency2ExecutorsAndCallables;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class P3_Main {
	/**
	 * All the commented lines are good.. just check them... there is nothing wrong
	 * with this code.. but in another classes try to run loop for 100000 times.. again 
	 * and again.. you will not get ans 0 all the time.. just check copy for proper
	 * explanation.
	 */
	
	
//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		P3_Value value=new P3_Value();
//		P3_Adder adder=new P3_Adder(value);
//		P3_Subtracter subtracter=new P3_Subtracter(value);
//		
//		ExecutorService es=Executors.newFixedThreadPool(2);
//		Future<Void> futureAdder = es.submit(adder);
//		Future<Void> futureSubtracter = es.submit(subtracter);
//		futureAdder.get();//this will ensure the thread to be completed.
//		futureSubtracter.get();
//		
//		System.out.println(value.value);//by clicking on these can check from where it is.
//		es.shutdown();
//	}

}
