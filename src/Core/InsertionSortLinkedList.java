
package Core;
public class InsertionSortLinkedList {

	public static void main(String[] args) {
		ListNode root=new ListNode(6);
		root.next=new ListNode(5);
		root.next.next=new ListNode(7);
		root.next.next.next=new ListNode(4);
		root.next.next.next.next=new ListNode(8);
		root.next.next.next.next.next=new ListNode(1);
		ListNode newRoot=sortValues(root);
	}

	private static ListNode sortValues(ListNode root) {
		ListNode prev=root;
		ListNode current=root.next;
		ListNode next=current.next;
		while(current!=null) {
			while(prev.val>current.val) {
				prev.next=current.next;
				current.next=prev;
				prev=current;
				current=current.next.next;
			}
			prev=current;
			current=current.next;
		}
		return null;
	}

}
