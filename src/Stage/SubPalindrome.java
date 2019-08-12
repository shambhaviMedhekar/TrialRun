package Stage;

public class SubPalindrome {

	public static void main(String[] args) {
		String value="bacadacxbzzzz";
		int left=0,right=value.length()-1;
		int start=0,end=value.length()-1;
		while(left<right) {
			if(value.charAt(left)!=value.charAt(right)) {
				left++;
				start=left;
				
			}
			if(value.charAt(left)!=value.charAt(right)) {
				right--;
				end=right;
			}
			if(value.charAt(left)==value.charAt(right)) {
				left++;
				right--;
			}
		}
		System.out.println(value.substring(start,end+1));
		
	}

}
