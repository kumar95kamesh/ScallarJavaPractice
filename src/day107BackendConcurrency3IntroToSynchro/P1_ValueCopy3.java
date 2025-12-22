package day107BackendConcurrency3IntroToSynchro;

public class P1_ValueCopy3 {
	public int value=0;
	
	synchronized void incrementedBy(int i) {
		value+=i;
	}
	
	synchronized void decrementedBy(int i) {
		value-=i;
	}

}
