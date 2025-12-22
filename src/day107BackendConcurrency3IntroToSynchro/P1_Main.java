package day107BackendConcurrency3IntroToSynchro;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P1_Main {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Lock lock=new ReentrantLock();
		
		P1_Value value=new P1_Value();
		P1_Adder adder=new P1_Adder(value,lock);
		P1_Subtracter subtracter=new P1_Subtracter(value,lock);
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		Future<Void> futureAdder = es.submit(adder);
		Future<Void> futureSubtracter = es.submit(subtracter);
		futureAdder.get();//this will ensure the thread to be completed.
		futureSubtracter.get();
		
		System.out.println(value.value);//by clicking on these can check from where it is.
		es.shutdown();
	}

}
