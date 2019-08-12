package RandomCode;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            
        double sum1=0;
        double sum2=0;
        
        int pow1=0;
        int pow2=0;
        ListNode recurr=l1;
        while(recurr!=null){
            int value1=(int) (recurr.val*(Math.pow(10,pow1)));
            sum1=sum1+value1;
            recurr=recurr.next;
            pow1++;
            
        }
        recurr=l2;
        while(recurr!=null){
            double value2=(double) (recurr.val*(Math.pow(10,pow2)));
            sum2=sum2+value2;
            recurr=recurr.next;
            pow2++;
            
        }
        
        int sum=(int) (sum1+sum2);
        System.out.println(sum1+sum2);
        /*if(pow1<pow2){
            pow1=pow2;
        }
        
        int digit=sum%10;
        sum=sum/10;
        ListNode result= new ListNode(digit);
        while(sum>0){
            digit=sum%10;
            sum=sum/10;
            ListNode newlistNode= new ListNode(digit);
            result.next=newlistNode;
            result=result.next;
        }
*/        return l2;
    }

	
	public static void main(String args[]) {
		ListNode l1=new ListNode(2);
		ListNode l2=new ListNode(4);
		ListNode l3=new ListNode(3);
		l1.next=l2;
		l2.next=l3;
		ListNode l4=new ListNode(5);
		ListNode l5=new ListNode(6);
		ListNode l6=new ListNode(4);
		l4.next=l5;
		l5.next=l6;
		ListNode result=addTwoNumbers(l1,l4);
		System.out.println(result);
		
	}
}
