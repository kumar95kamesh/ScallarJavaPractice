package day108backendLLDConcurrency4SynchronizationWithSemaphores;

import java.util.concurrent.atomic.AtomicInteger;

public class P2_Value {
	
	public AtomicInteger p2_Value=new AtomicInteger(0);

	/**
	 * For integer if we are adding or subtracting something to some shared value
	 * this will handle concurrency.
	 */
}

//generally what we were doing 
//this.v.value += i;//value ko leke increment kr rhe the.

//t <- value in 3 steps m ye hi kr rhe the or ye hi wo part h 
//t = t+i; 			jha pr risky code tha.. or value wrong assign ho ja rhi thi.
//t-> value

//basically what happens in Compare and Swap algo is

//t <- value -> x  .. value variable to new variable x m store kr liya
//t = t+i;
//t-> value
//if(value == x){	after doing all other operation check krte h.. agar value variable
//  t-> val;		and new variable same rha to proceed krenge otherwise dobara read.
//}else{
// re-read the initial value;
//     }

/**
 * There are other concurrent data structures also 
 * e.g. concurrent hashmap..
 * 
 * 
**/