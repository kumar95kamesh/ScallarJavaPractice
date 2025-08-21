package day107BackendConcurrency3IntroToSynchro;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class P1_Subtracter implements Callable<Void>{
	private P1_Value v;
	private Lock lock;
	
	P1_Subtracter(P1_Value v,Lock lock){
		this.v=v;
		this.lock=lock;
	}

	@Override
	public Void call() throws Exception {
		for(int i=1;i<=1000;i++) {
			lock.lock();
			System.out.println("Subtracter "+i);
			this.v.value-=i;
			lock.unlock();
		}
		return null;
	}

}
