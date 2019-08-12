package RandomCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LexicoSubsequence {

	public static void main(String[] args) {
		System.out.println(smallestSubsequence("cdadabcc"));
	}
	 public static String smallestSubsequence(String text) {
	        List<Character> vals=new ArrayList<Character>();
	        for(int i=0;i<text.length();i++){
	            if(!vals.contains(text.charAt(i))){
	            	vals.add(text.charAt(i));
	            }
	        }
	        Collections.sort(vals, new Comparator<Character>(){ 
	        	  
	            @Override
	            public int compare(Character c1, Character c2) 
	            { 
	                // ignoring case 
	                return Character.compare(Character.toLowerCase(c1), 
	                                        Character.toLowerCase(c2)); 
	            } 
	        }); 
	        return vals.toString();
	    }
}
