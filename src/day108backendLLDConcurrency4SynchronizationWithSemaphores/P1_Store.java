package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.ArrayList;
import java.util.List;

public class P1_Store {
	private int maxSize;
	private List<Object> items;
	
	public P1_Store(int maxSize) {
		this.maxSize=maxSize;
		this.items=new ArrayList<Object>();
	}
	
	public List<Object> getItems(){
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
		System.out.println("Consumer production time, Current size "+this.items.size());
		this.items.remove(this.items.size()-1);
	}

}
