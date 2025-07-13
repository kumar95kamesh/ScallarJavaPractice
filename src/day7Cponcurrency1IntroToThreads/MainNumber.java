package day7Cponcurrency1IntroToThreads;

public class MainNumber {

	public static void main(String[] args) {
		//printing 1-1000 in different threads
		for(int i=0;i<1000;i++) {
					NumberPrinter numberPrinter=new NumberPrinter(i);//this is why parameterize constructor
					Thread t=new Thread(numberPrinter);
					t.start();
		}
		

	}

}
