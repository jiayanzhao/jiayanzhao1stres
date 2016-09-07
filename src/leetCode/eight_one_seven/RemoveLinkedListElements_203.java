package leetCode.eight_one_seven;

public class RemoveLinkedListElements_203 {

	
    public ListNode removeElements(ListNode head, int val) {
    	if(head==null) return head;
        while(head!=null && head.val==val){
     	   head = head.next;
        }
        ListNode tem = head;
        while(tem!=null && tem.next!=null){
     	   if(tem.next.val==val){
     		   tem.next = tem.next.next;
     		   continue;
     	   }
     	   tem = tem.next;
        }
        return head;
    }
}
