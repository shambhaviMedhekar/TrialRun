package RandomCode;


import java.util.Random;

public class ShiftZero {

	public static void main(String[] args) {
		int input[]= {1,0,34,98,12,33,3,0,0,0,4,2,1,0,7,4,0,3,2,1,0,99,23,1,2,1,4,6,0,3,2,6,1,0,54,2};
		shift(input);
		for(int i=0;i<input.length;i++) {
			System.out.print(" "+input[i]+" ");
		}

	}

	private static void shift(int[] input) {
		// TODO Auto-generated method stub
		int left=0;
		int right=input.length-1;
		Random r =new Random();
		int a=r.nextInt(6)+5;
		System.out.println(a);
		while(left<=right) {
			if(input[left]!=0) {
				left++;
			}
			else if(input[right]==0) {
				right--;
			}
			else {
				int temp=input[left];
				input[left]=input[right];
				input[right]=temp;
			}
		}
	}

}
