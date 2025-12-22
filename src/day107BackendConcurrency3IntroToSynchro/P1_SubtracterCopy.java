package day107BackendConcurrency3IntroToSynchro;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class P1_SubtracterCopy implements Callable<Void>{
	private P1_Value v;
	private Lock lock;
	
	P1_SubtracterCopy(P1_Value v,Lock lock){
		this.v=v;
		this.lock=lock;
	}

	@Override
	public Void call() throws Exception {
		
		lock.lock();
		
		for(int i=1;i<=1000;i++) {
			
			System.out.println("Subtracter "+i);
			this.v.value-=i;
			
		}
		
		lock.unlock();
		
		return null;
	}

}
