package RandomCode;


public class RemoveMinForEvenSum {

	public static void main(String[] args) {
		int values[]= {1,2,3,4,6,7,8};
		int numRemoved=removeElements(values);
		System.out.println(numRemoved);
		
	}

	private static int removeElements(int[] values) {
		int count=0;
		int left=0,right=1;
		while(left<right && left<values.length && right<values.length) {
			int sum=values[left]+values[right];
			if(sum%2!=0) {
				right++;
				count++;
			}
			else {
				left=right;
				right=left+1;
			}
		}
		return count;
	}

}
