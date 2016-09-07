package leetCode.eight_one_eight;



public class SwapNodesinPairs_24 {

    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
    	ListNode tem = head; 
    	ListNode intermediary = null;
    	while(tem.next!=null){
    		if(head==tem){
    			head = tem.next;
    			intermediary = tem.next.next;
    			tem.next.next = tem;
    			tem.next = intermediary;
    		}else{
    			if(tem.next.next==null)return head;
    			intermediary = tem;
    			tem = tem.next;
    			intermediary.next = tem.next;
    			tem.next = intermediary.next.next;
    			intermediary.next.next = tem;
    		}
    	}
    	return head;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }