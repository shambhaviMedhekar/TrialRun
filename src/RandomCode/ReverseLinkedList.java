package RandomCode;


public class ReverseLinkedList {

	public static void main(String[] args) {
		Linked llist = new Linked();
		llist.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		llist.head.next = second;
		second.next = third;
		third.next=new ListNode(4);
		third.next.next=new ListNode(5);
		llist.head=reverseList(llist.head);
		ListNode curr=llist.head;
		while(curr!=null) {
			System.out.println(curr.val);
			curr=curr.next;
		}
	}	
	 public static ListNode reverseList(ListNode head) {
	        
	        ListNode lastValue=head;
	        while(lastValue.next!=null){
	            lastValue=lastValue.next;
	        }
	        ListNode last=null;
	        while(head!=lastValue){
	            ListNode curr=head;
	            while(curr.next!=last){
	                curr=curr.next;
	            }
	            ListNode currNext=head.next;
	            curr.next=head;
	            head.next=last;
	            last=head;
	            head=currNext;
	        }
	        String abc;
	        return head;
	        
	    }

}
