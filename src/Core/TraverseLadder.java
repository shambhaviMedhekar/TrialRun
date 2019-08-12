package Core;

public class TraverseLadder {
	static int count;
	public static void main(String[] args) {
		int n=5;
		count=0;
		int x=traverse(n);
		System.out.println(x);

	}

	private static int traverse( int current) {
		if(current==0){
			count++;
			return count;
			}
		if(current<0) {
			return count;
		}
			traverse(current-1);
			traverse(current-2);

			return count;
	}

}
