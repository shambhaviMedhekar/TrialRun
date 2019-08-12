package RandomCode;


import java.util.ArrayList;
import java.util.List;

public class FindPairs {

	public static void main(String[] args) {
		int values[]= {2,3,6,8,9,10};
		int x=15;
		List<List<List<Integer>>> count=findNumberofPairs(values,x);
		int value=0;
		System.out.println("Pairs are: ");
		for(int i=0;i<count.size();i++) {
			System.out.println(count.get(i).toString());
			value+=count.get(i).size();
		}
		
		
		System.out.println("Number of pairs possible: "+value);
		

	}

	private static List<List<List<Integer>>> findNumberofPairs(int[] values, int x) {
		int left=0;
		List<List<List<Integer>>> result=new ArrayList<List<List<Integer>>>();
		int right=values.length-1;
		while(left<right) {
			int sum=values[left]+values[right];
			List<List<Integer>> interm=new ArrayList<List<Integer>>();
			if(sum<x) {
				
				for(int i=left+1;i<=right;i++) {
					List<Integer> value=new ArrayList<Integer>();
					value.add(values[left]);
					value.add(values[i]);
					interm.add(value);
				}
				left++;
				result.add(interm);
			}
			else {
				right--;
			}
			
		}
		return result;
	}

}
