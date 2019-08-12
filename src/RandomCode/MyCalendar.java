package RandomCode;

import java.util.ArrayList;

public class MyCalendar {
	static ArrayList<Interval> intervals;
	public static void main(String[] args) {
		 MyCalendar obj = new MyCalendar();
		 int timings[][]= {{10,20},{15,25},{20,30}};
		 for(int i=0;i<timings.length;i++) {
			System.out.println(obj.book(timings[i][0],timings[i][1]));
			
		 }
		 
	}
	public static class Interval {
		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		int start;
		int end;
	}
    public MyCalendar() {
         intervals = new ArrayList();
    }
    
    public static boolean book(int start, int end) {
        if(intervals.isEmpty()) {
        	intervals.add(new Interval(start,end-1));
        	return true;
        }
        else if(intervals.contains(new Interval(start,end-1) )) {
        	return false;
        }
        else {
        	boolean canBeAdded=false;
        	for(int i=0;i<intervals.size();i++) {
        		if((intervals.get(i).start<start && intervals.get(i).end<start)||
        				(start<intervals.get(i).start && end<intervals.get(i).start)){
        			canBeAdded=true;
        		}
        		else if(start>=intervals.get(i).start && end<intervals.get(i).end) {
        			return false;
        		}
        		else if(start>=intervals.get(i).start && start=<intervals.get(i).end) {
        			return false;
        		}
        		else if(end>intervals.get(i).start && end<intervals.get(i).end) {
        			return false;
        		}
        		else if(intervals.get(i).start<=start && end>intervals.get(i).end) {
        			return false;
        		}
        	}
        	if(canBeAdded) {
        		intervals.add(new Interval(start,end-1));
        	}
        }
        
        return true;
    }

}
