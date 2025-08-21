package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class P1_Main2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/**
		 * This is not correct code.. check notes and new classes with copy.
		 */
		
		
		Semaphore prodSemaphore=new Semaphore(5);
		Semaphore consSemaphore=new Semaphore(0);
		ExecutorService es=Executors.newCachedThreadPool();
		P1_Store2 st=new P1_Store2(5);
		P1_Producer2 producer=new P1_Producer2(st,prodSemaphore,consSemaphore);
		P1_Consumer2 consumer=new P1_Consumer2(st,prodSemaphore,consSemaphore);
		
		for(int i=1;i<=8;i++) {
			es.execute(producer);
		}
		
		for(int i=1;i<=20;i++) {
			es.execute(consumer);
		}
		
	}

}
