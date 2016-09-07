package leetCode.eight_one_seven;

     /* class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }*/
public class LinkedListCycle_114 {

    public boolean hasCycle(ListNode head){
        if(head==null || head.next==null) return false;
        ListNode faster = head;
        ListNode slower = head;
        while(faster.next.next!=null && slower.next!=null){
        	if(faster == slower) return true;
        	else{
        	faster = faster.next.next;
        	slower = slower.next;
        	}
        }
        return false;
    }
}



     