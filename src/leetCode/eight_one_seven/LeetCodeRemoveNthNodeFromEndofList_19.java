package leetCode.eight_one_seven;

public class LeetCodeRemoveNthNodeFromEndofList_19 {

public ListNode removeNthFromEnd(ListNode head, int n) {
        
	if(head==null) return head;
	ListNode pmove = head;
	ListNode pindex = head;
	ListNode premove = head;
	int i = 0;
	   while(pmove!=null){
		   pmove = pmove.next;
		   i++;
		   if(i>n){
			   premove = pindex;
			   pindex = pindex.next;
		   }
	   }
	   if(premove == head){
		   head = head.next;
		   return head;
	   }else{
		   premove = premove.next.next;
		   return head;
	   }
	   
    }
}
