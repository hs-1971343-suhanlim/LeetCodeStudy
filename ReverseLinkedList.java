class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
	// 첫 출발 스택의 개념을 이용해서 만약 다음 값이 null을 가르키면 저장된 값 인출 후 연결 if(스택==재귀) use 
	public void helper(ListNode secNode, ListNode bef) {
		 if(secNode.next!=null)
			 helper(secNode.next, bef.next);
		 secNode.next = bef;
		 return;
	        
	}
    public ListNode reverseList(ListNode head) {
    	if(head==null||head.next==null) return head;
        // search last node
    	ListNode sol = head;
    	while(sol.next!=null) {
    		sol = sol.next;
    	}
        helper(head.next,head);
        // first node -> null
        head.next=null;
        return sol;
    }
}
public class ReverseLinkedList {

}
