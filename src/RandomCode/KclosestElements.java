package RandomCode;


import java.util.*;

public class KclosestElements {

	public static void main(String[] args) {
		List<Integer> input=new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		System.out.println(32.56%1==0);
		int data[]={7,1,5,3,6,2,8};
		Collections.sort(input,new SortByClosest(90));
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+" "+input.get(i));
		}
		
	}
	public static class SortByClosest implements Comparator<Integer> {
		int y;
		public SortByClosest(int i) {
			this.y=i;
		}

		@Override
		public int compare(Integer o1, Integer o2) {
			return Math.abs(y-o1)-Math.abs(y-o2);
		}

	}
	public static class SortByClosestArray implements Comparator<Integer> {
		int y;
		public SortByClosestArray(int i) {
			this.y=i;
		}

		@Override
		public int compare(Integer o1, Integer o2) {
			return Math.abs(y-o1)-Math.abs(y-o2);
		}

	}
}
