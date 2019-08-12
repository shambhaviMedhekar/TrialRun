package RandomCode;


import java.util.ArrayList;
import java.util.List;

public class CheckActive {

	public static void main(String[] args) {
		int[] states= {1,0,0,0,0,1,0,0};
		int days=2;
		List<Integer> prev=cellCompete(states,days);
		
	}
     
	  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	    public static List<Integer> cellCompete(int[] states, int days)
	    {
	    List<Integer> prev=new ArrayList<Integer>();
	    for(int i=0;i<states.length;i++){
	        prev.add(states[i]);
	       
	    }
	    for(int i=0;i<days;i++){
	        prev=changeStates(prev);
	    }
	    return prev;
	    }
	     public static List<Integer> changeStates(List<Integer> prev){
	    	 List<Integer> newprev=new ArrayList<Integer>();
		 	    for(int i=0;i<prev.size();i++){
		 	    	 newprev.add(0);
		 	    	
		 	    }
	         List<Integer> newstates=divideStates(prev,newprev,0,prev.size()-1);
	         return newstates;
	     }
	     public static List<Integer> divideStates(List<Integer> prev,List<Integer> newprev,int start,int end){
	         
	         if(start==end){
	             int left=0,right=0;
	             if(start==0){
	                 left=0;
	                 right=prev.get(start+1);
	             }
	             else if(end==prev.size()-1){
	                 right=0;
	                 left=prev.get(end-1);
	             }
	             else{
	                 left=prev.get(start-1);
	                 right=prev.get(start+1);
	             }
	             if(left==right){
	                 newprev.set(start,0);
	             }
	             else{
	                 newprev.set(start,1);
	             }
	         }
	         else{
	             int mid=start+(end-start)/2;
	             List<Integer> leftValue=divideStates(prev,newprev,start,mid);
	             List<Integer> rightValue=divideStates(prev,newprev,mid+1,end);
	         }
	         return newprev;
	     }
	    
	  // METHOD SIGNATURE ENDS
	
}
