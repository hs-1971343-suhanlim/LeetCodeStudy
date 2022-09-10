import java.util.StringTokenizer;

class Solution {
    public int lengthOfLastWord(String s) {
    	StringTokenizer st = new StringTokenizer(s," ");
    	String tmp="";
    	int n;
    	while(st.hasMoreTokens())
    		tmp = st.nextToken();
    	n = tmp.length();
    	return n;
    }
}

public class LengthofLastWord {
	public static void main(String args[]) {
	
	}
}
