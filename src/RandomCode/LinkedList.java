package RandomCode;


public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		} // Constructor
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.head = new Node(9);
		Node second = new Node(9);
		Node third = new Node(9);
		llist.head.next = second;
		second.next = third;
		third.next=new Node(9);
		third.next.next=new Node(9);
		third.next.next.next=new Node(9);
		
		LinkedList llist2 = new LinkedList();
		llist2.head = new Node(1);
		/*
		 * Node second2 = new Node(0); Node third2 = new Node(0); llist2.head.next =
		 * second2; second2.next = third2;
		 */
		LinkedList result=llist.findSum(llist2);
		result.printListValue();
	}
	private void printListValue() {
		Node n = head; 
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        }
	}
	private LinkedList findSum(LinkedList llist) {
		Node n = head; 
		Node n2=llist.head;
		int carry=0;
		LinkedList result=new LinkedList();
		Node current=null;
		while(n!=null || n2!=null) {
			int sum = carry + (n != null ? n.data : 0) 
					+ (n2 != null ? n2.data : 0);
			carry=0;
			carry = (sum >= 10) ? 1 : 0; 
			sum = sum % 10; 
			if(result.head==null) {
				result.head = new Node(sum);
				current=result.head;
			}
			else {
				current.next = new Node(sum);
				current = current.next;
			}
			if(n!=null)
			n=n.next;
			if(n2!=null)
			n2=n2.next;
			
			
		}
		if (carry > 0) { 
			current.next = new Node(carry); 
		}
		return result;
		
	}
	
	  public void printList(LinkedList llist, LinkedList llist22) { 
		Node n = head;
		StringBuilder str = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		while (n != null) {
			str.append((char) String.valueOf(n.data).charAt(0));
			n = n.next;
		}
		Node n2 = llist22.head;
		while (n2 != null) {
			str2.append((char) String.valueOf(n2.data).charAt(0));
			n2 = n2.next;
		}

		String number = str.toString();
		String number2 = str2.toString();
		int value = Integer.parseInt(number);
		int value2 = Integer.parseInt(number2);
		value = value + value2;
		String newNumber = Integer.toString(value);
		char newNum[] = newNumber.toCharArray();
		LinkedList llist2 = new LinkedList();
		Node current = null;
		for (int i = 0; i < newNum.length; i++) {
			if (i == 0) {
				llist2.head = new Node(newNum[i] - '0');
				current = llist2.head;
			} else {
				current.next = new Node(newNum[i] - '0');
				current = current.next;
			}
		}
		n = llist2.head;
		while (n != null) {
			System.out.print(n.data);
			n = n.next;
		}

	}
	 
}
