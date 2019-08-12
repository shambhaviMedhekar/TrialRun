package Core;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueImplUsingStack {
	static Stack<Integer> s1=new Stack<Integer>();
	static Stack<Integer> s2=new Stack<Integer>();
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.print();
		System.out.println("removed element: "+q.remove());
		q.print();
		System.out.println("Peeked element: "+q.peek());
		q.print();
		q.add(5);
		q.print();
		System.out.println("Polled element: "+q.poll());
		q.print();
		System.out.println("Size: "+q.size());
		
		
	}
	static class Queue{
		
		
		static void add(int element) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(element);
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			
		}
		static int remove() {
			if(s1.isEmpty()) {
				throw new NoSuchElementException();
			}
			return s1.pop();
		}

		
		  static int peek() {
			  if(s1.isEmpty()) {
				  return (Integer) null; 
				  } 
			  int value=s1.peek();
			  return value;
			  }
		  
		  static int poll() {
			  if(s1.isEmpty()) {
				  return (Integer) null; 
				  }
			  return s1.pop();
			  }
		 
		static int size() {
			return s1.size();
		}
		static void print() {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			
			int count=0;
			System.out.println("Queue: ");
			while(!s2.isEmpty()) {
				int value=s2.pop();
				System.out.println((count++)+" value: "+value+" ");
				s1.push(value);
			}
		}
	};
}
