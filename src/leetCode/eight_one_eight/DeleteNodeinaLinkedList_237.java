package leetCode.eight_one_eight;

public class DeleteNodeinaLinkedList_237 {

    public void deleteNode(ListNode node) {
    	while(node.next!=null){
        	node.val = node.next.val;
        	node = node.next;
        }
        node = null;
    }
    
    
    public void deleteNode_1(ListNode node) {
        while(node.next.next!=null){
        	node.val = node.next.val;
        	node = node.next;
        }
       node.val = node.next.val;
       node.next = null;
    }
    
}
