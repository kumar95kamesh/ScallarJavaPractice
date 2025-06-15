package day15InterviewProblemsArray3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Return the sorted list of intervals after merging all the overlapping intervals.
//Example Input
//Input 1:
//[1,3],[2,6],[8,10],[15,18]
//Output 1:
//[1,6],[8,10],[15,18]

public class MergeIntervals {
	 public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
	        // Sorting the intervals first based on start point and then based on end point.
	        Collections.sort(intervals, new IntervalComp());//end me coparator class h private..check that
	        
	        //res is the ArrayList that we will return
	        ArrayList<Interval> res;
	        
	        Interval inter;//private class niche h uska object
	        int n = intervals.size();//jitne bhi intervals h merge krne honge
	        res = new ArrayList<>();
	        
	        for (int i = 0; i < n;) {//differnt type to write a for loop
	            // making a new segment
	            inter = new Interval(intervals.get(i).start, intervals.get(i).end);//parameterised interval
	            				//list me se interval ko utha k uska start and end nikala
	            Interval next;	//uper ki line me pichla wala start and end nikal liya ab agle se compare krenge	
	            i++;
	            while (i < n) {
	                next = intervals.get(i);
	                // Checking if i-th element falls in the current segment
	                if (overlap(inter, next)) {
	                    // adding i-th element to the current segment
	                    inter.end = Math.max(inter.end, next.end);//start to sorting ki wjh se phle ka 
	                    //hi chota hoga or uska end dono ka max hoga.. to finally next wale inter ka 
	                    //start pichle wale inter k brabar and end pichle and next ka max hua jo add kr 
	                    //diya fir baad me next wala previous ho jayega ese hi loop chlega
	                    i++;
	                } else {
	                    break;
	                }
	            }
	            // adding current segment to our answer.
	            res.add(inter);
	        }
	        return res;
	    }
	    private boolean overlap(Interval int1, Interval int2) {
	        if (int1.end >= int2.start && int1.start <= int2.end)//agar doosre ka start phle k end se
	        	//chota hua and doosre ka end phle k start se bda bhi hona chahiye tbhi to overlap hoga 
	            return true;
	        return false;
	    }
	    
	    private class IntervalComp implements Comparator<Interval> {//apn ne interval class likhi h khud se jo 
	    	//inbuilt nhi h like koi list arrray etc. to ab use sort krne k liye method overriding ka use krke
	    	//inbuilt mtd ki trh behave krana pdega usi k liye y class h
	        @Override // override krenge inbuilt k uper... mtlb jb call kre to y wala mtd kaam kre
	        public int compare(Interval interval1, Interval interval2) {//sorting k liye 2 intervals comparision
	            int cmp =  Integer.compare(interval1.start, interval2.start);//dono invervals k start ka difference
	            // check krega y...
	            if (cmp != 0)//agar difference zero mean dono ka start same h to ab ending k base p sort krega jo else me h
	                return cmp;//wrna jo bhi start km hua wo return hoga
	            cmp = Integer.compare(interval1.end, interval2.end);
	            return cmp;// jo bhi end km hoga wo return ho jayega agar start same hue to
	        }
	    }
	    //given class in question
	    private class Interval {
			 int start;
		     int end;
		     Interval()//yellow isliye kuki y kaam hi ni aa ra... apn ko to start and end chahiye to second wala hi kaam ka h
		     {
		    	 start = 0; end = 0;
		     }
		     Interval(int s, int e) 
		     {
		    	 start = s; end = e; 
		     }
	}
}
