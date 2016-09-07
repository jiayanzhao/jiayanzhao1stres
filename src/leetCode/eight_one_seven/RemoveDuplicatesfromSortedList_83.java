package leetCode.eight_one_seven;

public class RemoveDuplicatesfromSortedList_83 {

    public ListNode deleteDuplicates(ListNode head) {
         if(head==null || head.next==null)return head;
         ListNode tem = head;
         while(tem.next!=null){
        	 if(tem.val==tem.next.val)tem.next = tem.next.next;
        	 else tem = tem.next;
         }
         return head; 
    }
}
