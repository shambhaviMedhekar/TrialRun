package RandomCode;


public class AddLinkedList {
	static int carry=0;
	LLNode head;
	static boolean sizeDifferent=false;
	static class LLNode{
		int data;
		LLNode next;

		LLNode(int d) {
			data = d;
			next = null;
		}
	}
	public static void main(String[] args) {
		AddLinkedList list1=new AddLinkedList();
		list1.head=new LLNode(9);
		list1.head.next=new LLNode(9);
		list1.head.next.next=new LLNode(9);
		AddLinkedList list2=new AddLinkedList();
		list2.head=new LLNode(9);
		list2.head.next=new LLNode(9);
		list2.head.next.next=new LLNode(9);
		list2.head.next.next.next=new LLNode(9);
		
		AddLinkedList resultList=new AddLinkedList();
		LLNode result=addLL(list1.head,list2.head);
		if(carry==1) {
			LLNode carryResult=new LLNode(1);
			carryResult.next=result;
			resultList.head=carryResult;
			
		}
		else {
			resultList.head=result;
		}
		LLNode listVal=resultList.head;
		while(listVal!=null) {
			System.out.print(listVal.data);
			listVal=listVal.next;
		}
	}
	private static LLNode addLL(LLNode node, LLNode node2) {
		LLNode value = null;
		if(node.next!=null && node2.next!=null) {
			value=addLL(node.next,node2.next);
			
		}
		else if(node.next!=null && node2.next==null) {
			if(!sizeDifferent) {
				sizeDifferent=true;
			}
			value=addLL(node.next,node2);
			
		}
		else if(node.next==null && node2.next!=null){
			if(!sizeDifferent) {
				sizeDifferent=true;
			}
			value=addLL(node,node2.next);
			
		}
		if(!sizeDifferent) {
		int sum=node.data+node2.data+carry;
		carry=sum>9?1:0;
		LLNode sumNode=new LLNode(sum%10);
		sumNode.next=value;
		
		return sumNode;
		}
		sizeDifferent=false;
		return value;
	}

}
