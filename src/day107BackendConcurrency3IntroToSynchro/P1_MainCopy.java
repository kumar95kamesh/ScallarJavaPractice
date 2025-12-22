package day107BackendConcurrency3IntroToSynchro;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class P1_MainCopy {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Lock lock=new ReentrantLock();
		
		P1_Value value=new P1_Value();
		P1_AdderCopy adder=new P1_AdderCopy(value,lock);
		P1_SubtracterCopy subtracter=new P1_SubtracterCopy(value,lock);
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		Future<Void> futureAdder = es.submit(adder);
		Future<Void> futureSubtracter = es.submit(subtracter);
		futureAdder.get();//this will ensure the thread to be completed.
		futureSubtracter.get();
		
		System.out.println(value.value);//by clicking on these can check from where it is.
		es.shutdown();
	}

}
