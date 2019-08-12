package RandomCode;


public class ArrayIntervals {

	public static void main(String[] args) {
		int[][] intervals= {{1,5}};
		int[] newInterval= {2,3};
		int[][] newIntervals=insert(intervals,newInterval);
		for(int i=0;i<newIntervals.length;i++) {
			System.out.println(newIntervals[i][0]+" "+newIntervals[i][1]);
			
		}
	}
	public static int[][] insert(int[][] intervals, int[] newInterval) {

        if(newInterval.length==0){
            return intervals;
        }
       
        int[][] newIntervals=new int[intervals.length+1][2];
        
        int count=0;
        if(intervals.length==0){
            newIntervals[count]=newInterval;
        }
        else
        {
        boolean added=false;
        int[] tobeAdded=newInterval;
        int[] tobeChecked=new int[2];
        for(int i=0;i<intervals.length;i++){
            if(i==0){
                newIntervals[count]=intervals[0];
                
                if(tobeAdded[0]<=newIntervals[count][1] && tobeAdded[1]>newIntervals[count][1]){
                    newIntervals[count][1]=tobeAdded[1];
                    added=true;
                }
                
            }
            else{
                if(added){
                tobeAdded=intervals[i];
                tobeChecked =newIntervals[count];
                }
                else{
                   tobeChecked =intervals[i]; 
                }
                 
                if(tobeAdded[0]<tobeChecked[1] && tobeAdded[1]>tobeChecked[1]){
                        count++;
	                    newIntervals[count][0]=tobeChecked[0];
                        newIntervals[count][1]=tobeAdded[1];
	                    added=true;
                        
	                }
                else if(tobeAdded[0]<=tobeChecked[1] && tobeAdded[1]>=tobeChecked[1]) {
                	newIntervals[count][0]=tobeChecked[0];
                    newIntervals[count][1]=tobeAdded[1];
                    added=true;
                }
	                else if(tobeAdded[0]<=tobeChecked[1]
							&& tobeAdded[1]>tobeChecked[1]){
	                    newIntervals[count][1]=tobeAdded[1];
	                    added=true;
                    }
                    else if(tobeAdded[0] < tobeChecked[1]
							&& tobeAdded[1] <= tobeChecked[1]){
	                }
                    else {
                    	count++;
                    	newIntervals[count][0]=tobeAdded[0];
                        newIntervals[count][1]=tobeAdded[1];
                    }
                
            }
        }
        if(!added) {
        	if(newInterval[0] < newIntervals[count][1]
					&& newInterval[1] <= newIntervals[count][1]){
        		
        	}
        	else {
        		count++;
            	newIntervals[count]=newInterval;	
        	}
        	
        }
        }
        
        int[][] result=new int[count+1][2];
        for(int i=0;i<=count;i++){
            result[i][0]=newIntervals[i][0];
            result[i][1]=newIntervals[i][1];
        }
        return result;
    }
}
