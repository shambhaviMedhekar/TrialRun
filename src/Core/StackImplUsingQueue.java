package Core;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class StackImplUsingQueue {
	static Queue<Integer> q1=new LinkedList<Integer>();
	static Queue<Integer> q2=new LinkedList<Integer>();
	public static void main(String[] args) {
		Stack q=new Stack();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.print();
		System.out.println("popped element: "+q.pop());
		q.print();
		System.out.println("Peeked element: "+q.peek());
		q.print();
		q.push(5);
		q.print();
		System.out.println("Size: "+q.size());
	}
	static class Stack{


		public void push(int i) {

			q1.add(i);

		}
		public int size() {
			return q1.size();
		}


		public int peek() { 
			if(q1.isEmpty()) {
				return (Integer)null;
			}
			int n=q1.size()-1;
			int count=0;
			while(count<n) {
				q2.add(q1.poll());
				count++;
			}
			int value=q1.poll();
			q2.add(value);
			while(!q2.isEmpty()) {
				q1.add(q2.poll());
			}
			return value;
			} 
		
		public int pop() { 
				if(q1.isEmpty()) {
					throw new EmptyStackException();
				}
				int n=q1.size()-1;
				int count=0;
				while(count<n) {
					q2.add(q1.poll());
					count++;
				}
				int value=q1.poll();
				while(!q2.isEmpty()) {
					q1.add(q2.poll());
				}
				return value;
		
		}

		public void print() {


			int count=0;
			System.out.println("Stack: ");

			while(!q1.isEmpty()) {
				int value=q1.poll();
				System.out.println((count++)+" value: "+value+" ");
				q2.add(value);
			}
			while(!q2.isEmpty()) {
				q1.add(q2.poll());
			}
		}

	}

}
