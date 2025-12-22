package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class P3_SubtracterDeadlock implements Callable<Void>{
	private P2_Value v;
	
	P3_SubtracterDeadlock(P2_Value v){
		this.v=v;
	}

	@Override
	public Void call() throws Exception {
		for(int i=1;i<=1000;i++) {
			System.out.println("Subtracter "+i);
			this.v.p2_Value.addAndGet(-i);
		}
		return null;
	}

}
