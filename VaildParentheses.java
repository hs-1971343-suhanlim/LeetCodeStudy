import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<>();
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)==')') {
    			if(!stack.isEmpty())
    				if(stack.pop()!='(')
    					return false;
    				else
    					continue;
    			else
    				return false;
    		}
    		else if(s.charAt(i)=='}') {
    			if(!stack.isEmpty())
    				if(stack.pop()!='{')
    					return false;
    				else
    					continue;
    			else
    				return false;
    		}
    		else if(s.charAt(i)==']') {
    			if(!stack.isEmpty())
    				if(stack.pop()!='[')
    					return false;
    				else
    					continue;
    			else
    				return false;
    		}
    		else 
    			stack.push(s.charAt(i));
    	}
    	if(stack.size()!=0)
    		return false;
    	else
    		return true;
    }
}
public class VaildParentheses {
	
}
