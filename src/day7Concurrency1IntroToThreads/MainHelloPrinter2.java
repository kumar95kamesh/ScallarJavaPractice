package day7Concurrency1IntroToThreads;

public class MainHelloPrinter2 {

	public static void main(String[] args) {
//		HelloPrinter2 t=new HelloPrinter2();
		//OR
		Thread t=new HelloPrinter2();
		t.start();

	}

}
