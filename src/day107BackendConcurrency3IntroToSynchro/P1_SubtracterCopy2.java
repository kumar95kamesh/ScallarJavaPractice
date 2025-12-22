package day107BackendConcurrency3IntroToSynchro;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class P1_SubtracterCopy2 implements Callable<Void>{
	private P1_Value v;
	
	P1_SubtracterCopy2(P1_Value v){
		this.v=v;
	}

	@Override
	public Void call() throws Exception {
		
		
		for(int i=1;i<=1000;i++) {
			
			synchronized (this.v) {//this is object of p1_value.. can be variable or.. any
				System.out.println("Subtracter "+i);
				this.v.value-=i;
			}
			
		}
		
		
		return null;
	}

}
