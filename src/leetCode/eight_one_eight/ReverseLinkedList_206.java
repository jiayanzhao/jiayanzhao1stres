package leetCode.eight_one_eight;

public class ReverseLinkedList_206 {//非常重要

    public ListNode reverseList(ListNode head) {//递归
    	if(head==null) return null;  
        if(head.next==null) return head;  
          
        ListNode p = head.next;  
        ListNode n = reverseList(p);  
          
        head.next = null;  
        p.next = head;  
        return n;  
    }
    public ListNode reverseList_1(ListNode head) {//枚举
    	if(head==null || head.next==null) return head;
    	
    	ListNode p = head.next;
    	ListNode pre = head; pre.next = null;
    	ListNode nxt;
    	while(p!=null){
    		nxt = p.next;
    		p.next = pre;
    		pre = p;
    		p = pre;
    	}
    	return pre;
    }
}
