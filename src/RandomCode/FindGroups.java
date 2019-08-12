package RandomCode;


import java.util.*;

public class FindGroups {

	public static void main(String[] args) {
		List<List<Integer>> input=new ArrayList<List<Integer>>();
		System.out.println("ENter dimension");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("enter input");
		for(int i=0;i<size;i++) {
			List<Integer> row=new ArrayList<Integer>();
			for(int j=0;j<size;j++) {
				row.add(sc.nextInt());
			}
			input.add(row);
			
		}
		System.out.println("Enter group size array size");
		int gSize=sc.nextInt();
		List<Integer> group=new ArrayList<Integer>();
		System.out.println("enter group values");
		for(int i=0;i<gSize;i++) {
			group.add(sc.nextInt());
			
		}
		List<Integer> countGroups=countGroups(input,group);
	}

	private static List<Integer> countGroups(List<List<Integer>> input, List<Integer> group) {
		List<Integer> countGroups=new ArrayList<Integer>();
		int down=0;
		int left=0;
		int calc1=0;
		int calc2=0;
		boolean lastRow=false;
		boolean lastCol=false;
		for(int i=0;i<input.size();i++) {
			List<Integer> row=input.get(i);
			for(int j=0;j<row.size();j++) {
				if(i<input.size()-1) {
					down=i+1;
				}
				else {
					lastRow=true;
				}
				if(j<row.size()-1) {
					left=j+1;
				}
				else {
					lastCol=false;
				}
				if(!lastRow && !lastCol) {
					calc1=Math.abs(i-i)+Math.abs(j-left);
					calc2=Math.abs(i-down)+Math.abs(j-j);
					
				}
			}
			
		}
		return countGroups;
	}

}
