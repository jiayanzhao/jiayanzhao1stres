package leetCode.eight_one_seven;

public class MergeTwoSortedLists_21 {

	
	public ListNode mergeTwoLists_mine(ListNode l1, ListNode l2) {
		if(l1==null) return l2;if(l2==null) return l1;
		ListNode result = null;
		ListNode tem = null;
		while(l1!=null && l2!=null){
			if(l1.val<l2.val){
				if(tem==null){
					tem = l1;
					result = tem;
				}else{
					tem.next = l1;
					tem = tem.next;
				}
				l1 = l1.next;
			}
			if(l1.val>l2.val){
				if(tem==null){
					tem = l2;
					result = tem;
				}else{
					tem.next = l2;
					tem = tem.next;
				}
				l2 = l2.next;
			}
		}
		if(l1!=null)tem.next = l1;else if(l2!=null)tem.next = l2;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	if(l1==null) return l2;
	if(l2==null) return l1;
	ListNode node = null;
	ListNode head = null;
	while(l1!=null && l2!=null){
		if(l1.val<l2.val){
			if(node==null){
				node = l1;
				head = node;
			}else{
				node.next = l1;
				node = node.next;
			}
			l1 = l1.next;
		}else{
			if(node==null){
				node = l2;
				head = node;
			}else{
				node.next = l2;
				node = node.next;
			}
			l2 = l2.next;
		}
	}
	if(l1!=null) node.next = l1;else if(l2!=null)node.next = l2;
	return head;
    }
}

 class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	  }