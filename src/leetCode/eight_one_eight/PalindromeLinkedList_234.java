package leetCode.eight_one_eight;

public class PalindromeLinkedList_234 {

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        if(head.next.next==null){
        	if(head.val==head.next.val)return true;else return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
        	fast = fast.next.next;
        	slow = slow.next;
        }
        ListNode pre = slow.next;
        pre.next = null;
        ListNode p = pre.next;
        ListNode tem;
        
        while(p.next!=null){
        	tem = p.next;
        	p.next = pre;
        	pre = p;
        	p = tem;
        }
        p.next = pre;
        
        while(p.next!=null){
        	if(p.val!=head.val)return false;
        	p = p.next;
        	head = head.next;
        }
        return true;
    }
}
