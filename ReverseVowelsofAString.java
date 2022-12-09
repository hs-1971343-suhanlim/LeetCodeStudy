import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
	private void swap(String list[],int i,int j) {
		String tmp=list[i];
		list[i]=list[j];
		list[j]=tmp;
	}
    public String reverseVowels(String s) {
    	String sol = "";
    	Deque<Integer> deq = new ArrayDeque<Integer>();
        String tmp[] = s.split("");
        for(int i=0;i<s.length();i++) {
        	if(tmp[i].equals("a")||tmp[i].equals("e")||tmp[i].equals("i")||
        			tmp[i].equals("o")||tmp[i].equals("u")||tmp[i].equals("A")||
        			tmp[i].equals("E")||tmp[i].equals("I")||
        			tmp[i].equals("O")||tmp[i].equals("U")) {
        		deq.add(i);
        	}
        }
        while(!deq.isEmpty()) {
        	if(deq.size()==1) break;
        	swap(tmp,deq.removeFirst(),deq.removeLast());
        }
        for(int i=0;i<tmp.length;i++)
        	sol+=tmp[i];
        return sol;
    }
}
public class ReverseVowelsofAString {
	public static void main(String args[]) {
		Solution s = new Solution();
		s.reverseVowels("hello");
	}
}
