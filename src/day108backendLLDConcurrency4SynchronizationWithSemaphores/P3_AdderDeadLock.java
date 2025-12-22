package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class P3_AdderDeadLock implements Callable<Void>{

	private P2_Value v;
	
	P3_AdderDeadLock(P2_Value v){
		this.v=v;
	}
	@Override
	public Void call() throws Exception {
		//add from 1 to 100 to v
		for(int i=1;i<=1000;i++) {
			System.out.println("Adder "+i);
			this.v.p2_Value.addAndGet(i);//it will add i to that variable.
		}
		return null;
	}

}
