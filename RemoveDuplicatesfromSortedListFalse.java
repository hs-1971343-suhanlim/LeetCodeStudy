
class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2() {}
    ListNode2(int val) { this.val = val; }
    ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode2 deleteDuplicates(ListNode2 head) {
    	if(head==null)
    		return null;
        ListNode2 result = new ListNode2();
        ListNode2 tmp = result;
        while(head.next != null) {
        	if(head.val!=head.next.val) {
        		tmp.next = new ListNode2();
        		tmp = tmp.next;
        		tmp.val = head.val;
        	}
        	head = head.next;
        	
        }
        tmp.next = new ListNode2();
        tmp.next.val = head.val;
        return result.next;
    }
}
public class RemoveDuplicatesfromSortedListFalse {
	public static void main(String args[]) {
		ListNode2 a = new ListNode2(1);
		ListNode2 b = new ListNode2(1);
		ListNode2 c = new ListNode2(2);
		a.next = b;
		b.next = c;
		Solution x = new Solution();
		x.deleteDuplicates(a);
	}
}
