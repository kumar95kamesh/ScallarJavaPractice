package day109_BackendLLD_JavaAdvanceConcepts1_Generics;

public class P1_Pair<V, S> {
	private V first;// first ka return type V
	private S second;// second ka S

	P1_Pair() {

	}

	P1_Pair(V first, S second) {
		this.first = first;
		this.second = second;
	}

	void setFirst(V first) {
		this.first = first;
	}

	void setSecond(S second) {
		this.second = second;
	}

	V getFirst() {
		return this.first;
	}

	S getSecond() {
		return this.second;
	}

	void print() {
		System.out.println("Printing in pair");
	}

	// V and S willl not be available here
	/**
	 * Static methods can be called with className.function() but here while calling we 
	 * can provide data to parameters only e.g. pair.dosomething(5,6).. here how it is
	 * going to decide the data types... so it can not be written like this
	 */
//	public static V doSomething(V val1, S val2) {
//		System.out.println(val1);
//		return val1;
//	}
	
	// Generic Method
	/**
	 * we can write it at function level. 
	 * <V,S> data types and V is return type
	 * and these V,S type variable will be available with in this method only.
	 */
	public static <V, S> V doSomething(V val) {
//        System.out.println(val);
		return val;
	}
	
	public <Z,Y> Y doAgain(V data,Y val, Z val2){
        return val;
        //if return Z then return type will be Z
        /**
         * So basically it will accept V,Y,Z type of data only
         * V type is available at class level so it can accept that also.
         * But Y,Z will be available only in this method.
         * and these are generic types so these will accept any kind of data type.
         */
    }

	public int doSomethingAgain(int val) {
//        System.out.println(val);
		return val;
	}
}
