package day107BackendConcurrency3IntroToSynchro;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class P1_AdderCopy2 implements Callable<Void>{

	private P1_Value v;
	
	P1_AdderCopy2(P1_Value v){
		this.v=v;
	}
	@Override
	public Void call() throws Exception {
		
		
		for(int i=1;i<=1000;i++) {
			
			synchronized (this.v) {
			System.out.println("Adder "+i);
			this.v.value+=i;//click on v and value this.v--> Adder and value-->Value class
			//basically Value class k variable m i add ho rha h
			}
		}
		
		
		return null;
	}

}
