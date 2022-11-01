import java.util.HashMap;
import java.util.Map;


class Solution {
	// put 은 키와 관련된 이전 값 또는 키에 대한 매핑이 없는 경우 null을 리턴한다.
	public boolean wordPatternAprochMe(String pattern, String str) {
	    String[] words = str.split(" ");
	    if (words.length != pattern.length())
	        return false;
	    Map index = new HashMap();
	    for (Integer i=0; i<words.length; ++i)
	        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
	            return false;
	    return true;
	}
	// time complex O(n)
    public boolean wordPattern(String pattern, String s) {
    	String array[] = s.split(" ");
        if(pattern.length()==1&&array.length==1) return true;
        if(pattern.length()!=array.length) return false;
    	HashMap<Character,String> map = new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++) {
        	if(map.containsKey(pattern.charAt(i))) {
        		if(!map.get(pattern.charAt(i)).equals(array[i]))
        			return false;
        	}
        	else {
        		if(map.containsValue(array[i])) 
        			return false;
        		map.put(pattern.charAt(i), array[i]);
        	}
        }
        return true;
    }
}
public class WordPattern {
	public static void main(String args[]) {
		Solution s = new Solution();
		String a = "abba";
		String b = "dog cat cat dog";
		s.wordPattern(a, b);
	}
}
