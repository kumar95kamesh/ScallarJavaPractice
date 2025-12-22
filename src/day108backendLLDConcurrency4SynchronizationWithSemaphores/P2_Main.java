package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class P2_Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		P2_Value value = new P2_Value();
		P2_Adder adder = new P2_Adder(value);
		P2_Subtracter subtracter = new P2_Subtracter(value);

		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<Void> futureAdder = es.submit(adder);
		Future<Void> futureSubtracter = es.submit(subtracter);

		futureAdder.get();
		futureSubtracter.get();

		System.out.println(value.p2_Value);
		es.shutdown();

	}

}
