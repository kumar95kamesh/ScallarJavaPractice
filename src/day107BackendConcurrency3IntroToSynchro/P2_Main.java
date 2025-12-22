package day107BackendConcurrency3IntroToSynchro;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P2_Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/**
		 * This will run infinite time because of while loop
		 * this is also not good code... 
		 * Here in this code we are allowing one producer to produce at a time or
		 * only one consumer at a time to consume
		 * but if in sotre we have 2 objects in that case we can have 8 producers and 
		 * 2 consumers(e.g. max size =10). so this will be proper way of using
		 * parallism.. otherwise we can run this code ni single thread also.. it will be 
		 * same result... 
		 * 
		 * continue in next session.
		 * 
		 */
		
		ExecutorService es=Executors.newCachedThreadPool();
		P2_Store st=new P2_Store(10);
		P2_Producer producer=new P2_Producer(st);
		P2_Consumer consumer=new P2_Consumer(st);
		
		for(int i=0;i<15;i++) {
			es.execute(producer);
		}
		
		for(int i=0;i<25;i++) {
			es.execute(consumer);
		}
		
		es.shutdown();
	}

}
