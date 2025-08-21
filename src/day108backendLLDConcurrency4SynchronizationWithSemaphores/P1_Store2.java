package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class P1_Store2 {
	private int maxSize;
//	private List<Object> items; instead of this use below.. because List is not thread safe.
	private ConcurrentLinkedDeque<Object> items;
	
			
	
	public P1_Store2(int maxSize) {
		this.maxSize=maxSize;
		this.items=new ConcurrentLinkedDeque<Object>();
	}
	
	public ConcurrentLinkedDeque<Object> getItems(){
		return items;
	}
	
	public int getMaxSize() {
		return maxSize;
	}
	
	public void addItems() {
		System.out.println("Producer production time, Current size "+this.items.size());
		this.items.add(new Object());
	}
	
	public void removeItems() {
		System.out.println("Consumer Consumption time, Current size "+this.items.size());
//		this.items.remove(this.items.size()-1);
		this.items.remove();//No need to specify index it will just remove last index.
	}

}
