import java.util.LinkedList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
	 public boolean isPalindromeOptimal(ListNode head) {
	        ListNode slow = head, fast = head, prev, temp;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        prev = slow;
	        slow = slow.next;
	        prev.next = null;
	        while (slow != null) {
	            temp = slow.next;
	            slow.next = prev;
	            prev = slow;
	            slow = temp;
	        }
	        fast = head;
	        slow = prev;
	        while (slow != null) {
	            if (fast.val != slow.val) return false;
	            fast = fast.next;
	            slow = slow.next;
	        }
	        return true;
	    }
	public int getListNodeHalfLength(ListNode head) {
		int count=0;
		while(head!=null) {
        	count++;
        	head = head.next;
        }
		if(count==1)
			return 1;
		return count/2;
	}
	public boolean getListNodeLengthOdd(ListNode head) {
		int count=0;
		while(head!=null) {
        	count++;
        	head = head.next;
        }
		if(count%2==0)
			return false;
        else
        	return true;
	}
    public boolean isPalindrome(ListNode head) {
        ListNode tmp = head;
        boolean flag = getListNodeLengthOdd(head);
        Stack<Integer> stack = new Stack<Integer>();
        int n=getListNodeHalfLength(head);
        if(head.next==null) return true;
        for(int i=0;i<n;i++) {
        	stack.add(tmp.val);
        	tmp = tmp.next;
        }
        if(flag) {
        	tmp = tmp.next;
        	while(tmp!=null) {
        		if(stack.pop()!=tmp.val)
        			return false;
        		tmp = tmp.next;
        	}
        }
        else {
        	while(tmp!=null) {
        		if(stack.pop()!=tmp.val)
        			return false;
        		tmp = tmp.next;
        	}
        }
        return true;
    }
}
public class PalindromeLinkedList {
	public static void main(String args[]) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(0);
		ListNode c = new ListNode(0);
		ListNode d = new ListNode(1);
		a.next=b;
		b.next=c;
		c.next=d;
		Solution z = new Solution();
		z.isPalindrome(a);
	}
}
