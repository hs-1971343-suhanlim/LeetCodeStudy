
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
    	ListNode tmp = head;
    	ListNode bef = new ListNode();
    	ListNode sol = bef;
    	while(tmp!=null){
    		if(tmp.val==val) {
    			while(tmp.next!=null&&tmp.next.val==val) {
    				tmp = tmp.next;
    			}
    			bef.next = tmp.next;
    			tmp = tmp.next;
    		}
    		else
    			bef.next=tmp;
    		bef = bef.next;
    		if(tmp!=null)
    			tmp = tmp.next;
    	}
    	head = sol;
    	return head.next;
    }
}/*
class Solution {	
    public ListNode removeElements(ListNode head, int val) {
    ListNode current = head;
    // skip any val elements at the start of the list
    while (current != null && current.val == val) {
        current = current.next;
    }
 
    // here we either found the first non-val element
    // or are at the end of the list
    head = current; 
    ListNode lastGoodElement = head; 
    while (current != null) {
        if (current.val == val) {
            lastGoodElement.next = current.next;
        } else {
            lastGoodElement = current;
        }
        current = current.next;
    }        

    return head;
}
}*/
public class RemoveLinkedListElements {

}
