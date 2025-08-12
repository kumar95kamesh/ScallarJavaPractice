package day8_Concurrency2ExecutorsAndCallables;

import java.util.concurrent.Callable;

public class P3_Subtracter implements Callable<Void>{
	private P3_Value v;
	
	P3_Subtracter(P3_Value v){
		this.v=v;
	}

	@Override
	public Void call() throws Exception {
		for(int i=1;i<=100;i++) {
			this.v.value-=i;
		}
		return null;
	}

}
