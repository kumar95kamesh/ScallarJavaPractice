package day107BackendConcurrency3IntroToSynchro;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class P1_AdderCopy3 implements Callable<Void>{

	private P1_ValueCopy3 v;
	
	P1_AdderCopy3(P1_ValueCopy3 v){
		this.v=v;
	}
	@Override
	public Void call() throws Exception {
		
		
		for(int i=1;i<=1000;i++) {
			
			System.out.println("Adder "+i);
			this.v.incrementedBy(i);
		}
		
		
		return null;
	}

}
