package day8_Concurrency2ExecutorsAndCallables;

import java.util.concurrent.Callable;

public class P3_Adder implements Callable<Void>{

	private P3_Value v;
	
	P3_Adder(P3_Value v){
		this.v=v;
	}
	@Override
	public Void call() throws Exception {
		//add from 1 to 100 to v
		for(int i=1;i<=100;i++) {
			this.v.value+=i;//click on v and value this.v--> Adder and value-->Value class
			//basically Value class k variable m i add ho rha h
		}
		return null;
	}

}
