package day107BackendConcurrency3IntroToSynchro;

public class P2_Producer implements Runnable {
	P2_Store store;
	
	public P2_Producer(P2_Store st) {
		this.store=st;
	}
	

	@Override
	public void run() {
		while (true) {
			synchronized (store) {
				if(store.getItems().size()<store.getMaxSize()) {
				store.addItems();
			}
			}
		}
	}
}
