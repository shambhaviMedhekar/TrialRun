package RandomCode;


public class LongestNumericPalindrome {

	public static void main(String[] args) {
		int values[]= {121,1221,12,1432341,333444333,4323,15751,2312};
		int value=findlongest(values);
		System.out.println("Longest palindrome is "+value);
	}

	private static int findlongest(int[] values) {
		int size=0;
		int longest=0;
		
		for(int i=0;i<values.length;i++) {
			if(isPalindrome(values[i])) {
				if(size<String.valueOf(values[i]).length()) {
					size=String.valueOf(values[i]).length();
					longest=values[i];
				}
			}
		}
		return longest;
	}

	private static boolean isPalindrome(int i) {
		int div=1;
		while(i/div>=10) {
			div*=10;
		}
		while(i!=0) {
			int msb=i/div;
			int lsb=i%10;
			if(msb!=lsb) {
				return false;
			}
			i=(i%div)/10;
			div=div/100;
		}
		return true;
	}

}
