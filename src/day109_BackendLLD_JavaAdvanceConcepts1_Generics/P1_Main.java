package day109_BackendLLD_JavaAdvanceConcepts1_Generics;

import java.util.ArrayList;
import java.util.HashMap;

public class P1_Main {
	public static void main(String[] args) {
		P1_Pair<Integer, String> p1 = new P1_Pair(1, "Shyam");
		p1.doAgain(2, "SRK", 2.5);//first value '2' will be type of Int only because it is
		//of Integer..its defined at class level but y,z can have any kind of data types.. try changing them
//		p1.setFirst("SRK"); will get error here bcoz its int type.
		System.out.println(p1.getSecond());

		P1_Pair<String, Double> p2 = new P1_Pair("Ram", 2.2);
		System.out.println(p2.getFirst());

		P1_OldPair p3 = new P1_OldPair();
		p3.first = "SRK";//but any other user can give first as any other data type here.. its object type.
		p3.first = 5;

		// This is allowed because of backward compatibility
		P1_Pair p5 = new P1_Pair();

		HashMap<String, Integer> hmap = new HashMap<>();//after java 5 we have.. call parametrized type hashmap
		HashMap hmap2 = new HashMap();// earlier we had... but its still there for older ppl support.//called legacy type hashmap.

		ArrayList list = new ArrayList();// older type

		P1_Pair.doSomething(1); // will return 1
		System.out.println(P1_Pair.doSomething(5));

	}
}
