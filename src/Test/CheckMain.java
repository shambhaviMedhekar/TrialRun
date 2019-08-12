package Test;

public class CheckMain {
	   public static void main(String args[]) {
		  int sum=0;
		   for(int i=1;i<=100;i++) {
			   sum=sum+i;
		   }
		   System.out.println(sum);
		   int x, y;
			
			x = 5 >> 2;
		   System.out.println(x);
			y = x >>> 2;
	 		System.out.println(y);
	 		String one="abc";
	 		String two=new String("abc");
	 		if(one.equals(two)) {
	 			System.out.println("true");
	 		}
	 		if(one==(two)) {
	 			System.out.println("true");
	 		}
	 		else {
	 			System.out.println("false");
	 		}
		   
	   }
}
