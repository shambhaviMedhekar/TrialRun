package RandomCode;


public class Maxprofit {

	public static void main(String[] args) {
		int values[]= {7,1,5,3,6,4,3,5,8};
		int value=maxPro(values);
		System.out.println(value);
	}

	private static int maxPro(int[] values) {
		int profit=0;
		int minPrice=Integer.MAX_VALUE;
		for(int i=0;i<values.length;i++) {
			if(values[i]<minPrice) {
				minPrice=values[i];
			}
			else if(values[i]-minPrice>profit) {
				profit=values[i]-minPrice;
			}
		}
		return profit;
	}

}
