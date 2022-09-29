class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
class Solution {
	/* badly simply think
    public boolean hasCycle(ListNode head) {
    	if(head == null)
    		return false;
    	ListNode tmp = head;
    	int count = 1;
    	while(tmp.next!=null) {
        	ListNode tmp2 = head;
    		for(int i=0;i<count;i++) {
    			if(tmp.next==tmp2)
    				return true;
    			tmp2 = tmp2.next;
    		}
    		count++;
    		tmp = tmp.next;
    	}
    	return false;
    }*/
    public boolean hasCycle(ListNode head) {
    	ListNode slow = head;
    	ListNode fast = head;
    	while(fast!=null&&fast.next!=null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		if(slow==fast)
    			return true;
    	}
    	return false;
    }
}
public class LinkedListCycle {

}
