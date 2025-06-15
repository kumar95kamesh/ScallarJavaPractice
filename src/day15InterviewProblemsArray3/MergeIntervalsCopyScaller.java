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

public class MergeIntervalsCopyScaller {

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int i = 0;
		int start = newInterval.start;
		int end = newInterval.end;
		int startIndex = -1;
		int endIndex = -1;
		for (Interval in : intervals) {
			if (start >= in.start && start <= in.end)
				startIndex = i;
			if (end >= in.start && end <= in.end)
				endIndex = i;
			i++;
		}
		// endpoints of new interval doesn't lie inside any other interval
		if (startIndex == -1 && endIndex == -1) {
			startIndex = 0;
			for (i = 0; i < intervals.size(); i++) {
				if (start > intervals.get(i).end) {
					startIndex = i + 1;
				}
			}
			endIndex = intervals.size() - 1;
			for (i = intervals.size() - 1; i >= 0; i--) {
				if (end < intervals.get(i).start) {
					endIndex = i - 1;
				}
			}
			// Intervals between startIndex and endIndex lies completely inside new interval
			for (i = startIndex; i <= endIndex; i++) {
				intervals.remove(startIndex);
			}
			intervals.add(startIndex, newInterval);
			return intervals;
		}
		if (startIndex == -1) {
			for (i = intervals.size() - 1; i >= 0; i--) {
				if (start <= intervals.get(i).start)
					startIndex = i;
			}
		}
		if (endIndex == -1) {
			for (i = 0; i < intervals.size(); i++) {
				if (end >= intervals.get(i).end)
					endIndex = i;
			}
		}
		start = Math.min(intervals.get(startIndex).start, start);
		end = Math.max(intervals.get(endIndex).end, end);
		intervals.get(startIndex).start = start;
		intervals.get(startIndex).end = end;
		for (i = startIndex + 1; i <= endIndex; i++) {
			intervals.remove(startIndex + 1);
		}
		return intervals;
	}

	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}
}
