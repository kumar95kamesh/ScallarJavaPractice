package day107BackendConcurrency3IntroToSynchro;

public class P2_Consumer implements Runnable {
	P2_Store store;
	
	public P2_Consumer(P2_Store st) {
		this.store=st;
	}
	

	@Override
	public void run() {
		while (true) {
			synchronized (store) {
							if(store.getItems().size()>0) {
				store.removeItems();
			}
			}
		}
	}
}
