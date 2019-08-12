package RandomCode;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InttoBinary {

	public static void main(String[] args) {
		/*
		 * int val=3; String value=Integer.toBinaryString(val);
		 */
		//int count= (int) value.chars().filter(ch -> ch == '1').count();
		//System.out.println(count);
		/*
		 * int[] vals= {1,2,3,3}; int n=vals.length/2; List<Integer> list =
		 * Arrays.stream(vals).boxed().collect(Collectors.toList()); for(int
		 * i=0;i<vals.length;i++) { int count=Collections.frequency(list,vals[i]);
		 * if(count==n) { System.out.println(vals[i]);; } }
		 */
		int n=16;
		if(n%2==1 && n!=1){
	        System.out.println("No");;
	        }
		else {
	        int div=2;
	        int val=Integer.valueOf(n);
	        while(val/2>0){
	           val=val/2;
	            if(val%2==1 && val!=1){
	            	System.out.println("No");
	            }
	        }
	        System.out.println("Yes");
		}
	}

}
