package day16_BitManupulation;

//Alex and Sam are good friends. Alex is doing a lot of programming these days. 
//He has set a target score of A for himself.
//Initially, Alex's score was zero. Alex can double his score by doing a question, 
//or Alex can seek help from Sam for doing questions that will contribute 1 to Alex's 
//score. Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.
//Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A.

public class Prob1 {
	/**
	 * agar kisi bhi num. k set bits count kroge to y hi ans aayega esa isliye hua
	 * ki final value A chahiye wo bhi kisi bhi value ko double krke or counting bhi
	 * minimum rkhni h
	 * Ex:- A=5
	 *  Initial score : 0 Takes help from Sam, score : 1 Alex
	 * solves a question, score : 2 Alex solves a question, score : 4 Takes help
	 * from Sam, score: 5
	 * 
	 * Ex:- A-7
	 * Takes help from Sam, score : 1
	 * double==2
	 * double+1=3 THEN double ==6 and double+1=7
	 * 
	 * agar 2*2=4 s dkhoge to ans 4 aayega
	 * sam ki help =1
	 * double=2 then double 4
	 * ab 3 baar or sam ki help leni pdegi 7 k liye to total 4 ho jata pr apn ko 
	 * minimum chahiye
	 */

	// checking no. of set bits y hmesha koshish kro ki right shift se kro
	// left shift m kafi dikkat h
	public int solve(int A) {
		int count = 0;
		while (A > 0) {
			if ((A & 1) != 0)
				count++;
			A = A >> 1;
		}
		return count;
	}

}
