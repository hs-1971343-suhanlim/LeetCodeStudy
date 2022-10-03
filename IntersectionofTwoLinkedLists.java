
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
/*
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode tmpA = headA;
    	while(tmpA!=null) {
        	ListNode tmpB = headB;
        	while(tmpB!=null) {    		
        		if(tmpA==tmpB) return tmpA;
        		tmpB = tmpB.next;
        	}
        	tmpA = tmpA.next;
        }
        return null;
    }
}*/
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode tmpA = headA;
    	ListNode tmpB = headB;
    	while(tmpA!=tmpB) {
    		tmpA = tmpA == null ? headB : headA.next;
    		tmpB = tmpB == null ? headA : headB.next;
    	}
    	return tmpA;
    }
}
public class IntersectionofTwoLinkedLists {

}
