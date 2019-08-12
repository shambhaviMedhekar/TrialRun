package Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;


public class CheckCharArray {

	public static void main(String[] args) {
		
		/*
		 * String[] ops= {"4","D","D","C","D"}; int sum=0; int prevsum=0; Stack<Integer>
		 * values=new Stack<Integer>(); for(int i=0;i<ops.length;i++){
		 * if(ops[i].equals("[")) { } if(ops[i]=="+"){ int
		 * val1=values.get(values.size()-1); int val2=values.get(values.size()-2);
		 * prevsum=sum; sum+=val1+val2;
		 * 
		 * } else if(ops[i]=="C"){ sum=prevsum; values.pop();
		 * 
		 * } else if(ops[i]=="D"){ int value=values.peek(); prevsum=sum; sum+=(value*2);
		 * values.add(value*2); } else{ prevsum=sum; sum+=Integer.parseInt(ops[i]);
		 * values.add(Integer.parseInt(ops[i])); } }
		 */
			String s="2[abc]3[cd]ef";
	       StringBuilder finalValue=new StringBuilder();
	        Stack<Character> values=new Stack<Character>();
	        for(int i=0;i<s.length();i++){
	        	char tocheck=s.charAt(i);
	        	if(tocheck!=']'){
	                values.push(tocheck);
	            }
	            else{
	                StringBuilder val=new StringBuilder();
	                while(!values.peek().equals('[')){
	                    char exp=values.pop();
	                    val.append(exp);
	                }
	                values.pop();
	                String tobeAdded=val.reverse().toString();
	                int count=Character.getNumericValue(values.pop());
	                for(int j=0;j<count;j++){
	                    finalValue.append(tobeAdded);
	                }
	                
	            }
	        }
	        if(!values.isEmpty()) {
	        	StringBuilder val=new StringBuilder();
                while(!values.isEmpty()){
                    char exp=values.pop();
                    val.append(exp);
                }
                String tobeAdded=val.reverse().toString();
                finalValue.append(tobeAdded);
	        }
	        System.out.println(finalValue.toString());
	}
}
