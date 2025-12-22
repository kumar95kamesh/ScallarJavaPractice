package day8_Concurrency2ExecutorsAndCallables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class P1_Main_NumberPrinter {

	public static void main(String[] args) {
//		ExecutorService eS=Executors.newFixedThreadPool(10);//number of threads will be created.
		ExecutorService eS=Executors.newCachedThreadPool();//it will create new thread based on demand if all threads are busy.
/**
 * performance number of threads create and use pr depend krta h. to na to jyada and na hi km threads ho..
 * cahcheThreadPool m performance kafi better mili.
 */
		
		for(int i=1;i<=1000;i++) {
			P1_NumberPrinter n=new P1_NumberPrinter(i);
			eS.execute(n);  
		}
		System.out.println("check to console... pool was closed just after this print but still other threads are executing.");
		eS.shutdown();//to close the pool... pool will be closed after all the threads to be completed.
	}

}
