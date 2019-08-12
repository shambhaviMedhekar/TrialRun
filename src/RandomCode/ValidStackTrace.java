package RandomCode;


import java.util.Stack;

public class ValidStackTrace {

	public static void main(String[] args) {
		int pushed[]= {1,2,3,4,5};
		int popped[]= {4,5,3,2,1};
		System.out.println(validateStackSequences2(pushed, popped));

	}

	private static boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> vals=new Stack<Integer>();
		int i=0,j=0;
		while(j!=popped.length) {
			if(vals.isEmpty() || vals.peek()!=popped[j]) {
				vals.push(pushed[i]);
				if(i!=pushed.length-1) {
					i++;
				}
			}
			else {
				vals.pop();
				j++;
				if(i!=pushed.length-1) {
					i++;
				}
				
			}
		}
		
		return vals.isEmpty();
	}
	private static boolean validateStackSequences2(int[] pushed, int[] popped) {
		int i=0,j=0;
		int count=0;
		boolean minus=false;
		while(j!=popped.length) {
			if(pushed[i]!=popped[j]) {
				if(i!=pushed.length-1) {
					i++;
				}
			}
			else {
				j++;
				
				if(i!=pushed.length-1 && !minus) {
					i++;
				}else {
					if(minus) {
						if(i!=0)
							i--;	
					}
					else {
					minus=true;
					i=i-j;
					}
				}
			}
		}
		
		return i==0 && j==popped.length?true:false;
		
	}
	private static boolean validateStackSequencesRight(int[] pushed, int[] popped) {
		 int N = pushed.length;
	        Stack<Integer> stack = new Stack();

	        int j = 0;
	        for (int x: pushed) {
	            stack.push(x);
	            while (!stack.isEmpty() && j < N && stack.peek() == popped[j]) {
	                stack.pop();
	                j++;
	            }
	        }

	        return j == N;
	}
}
