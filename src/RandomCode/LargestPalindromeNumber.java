package RandomCode;


import java.util.Arrays;

public class LargestPalindromeNumber {

	public static void main(String[] args) {
		int values[]= {1, 232, 54545, 99999};
		Arrays.sort(values);
		for(int i=values.length-1;i>=0;i--) {
			if(isPalindrome(values[i])) {
				System.out.println(values[i]);
				break;
			}
		}
	}

	private static boolean isPalindrome(int n) {
		int div=1;
		while(n/div>=10) {
			div*=10;
		}
		while(n!=0) {
			int msb=n/div;
			int lsb=n%10;
			if(msb!=lsb)
				return false;
			n=(n%div)/10;
			div=div/100;
		}
		return true;
	}

}
