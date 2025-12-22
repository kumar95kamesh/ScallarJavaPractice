package day107BackendConcurrency3IntroToSynchro;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class P1_AdderCopy implements Callable<Void>{

	private P1_Value v;
	private Lock lock;
	
	P1_AdderCopy(P1_Value v,Lock lock){
		this.v=v;
		this.lock=lock;
	}
	@Override
	public Void call() throws Exception {
		
		lock.lock();
		
		for(int i=1;i<=1000;i++) {
			
			System.out.println("Adder "+i);
			this.v.value+=i;//click on v and value this.v--> Adder and value-->Value class
			//basically Value class k variable m i add ho rha h
		}
		
		lock.unlock();
		
		return null;
	}

}
