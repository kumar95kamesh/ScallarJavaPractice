package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class MainFooBar {
	public static void main(String[] args) {
		Semaphore fooSemaphore=new Semaphore(1);
		Semaphore barSemaphore=new Semaphore(0);
		
		Foo foo=new Foo(10, fooSemaphore, barSemaphore);
		Bar bar=new Bar(10, fooSemaphore, barSemaphore);
		
		ExecutorService es=Executors.newCachedThreadPool();
		es.execute(foo);
		es.execute(bar);
	}

}
