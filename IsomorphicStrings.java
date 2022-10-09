import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
        	if(map.containsKey(s.charAt(i))) {
        		if(map.get(s.charAt(i))!=t.charAt(i))
        			return false;
        	}
        	else {
        		if(map.containsValue(t.charAt(i)))
        			return false;
        		map.put(s.charAt(i), t.charAt(i));
        	}
        }
        return true;
    }
}
public class IsomorphicStrings {
	public static void main(String args[]) {
		Solution s = new Solution();
		String a = "egg";
		String b = "gbb";
		System.out.println(s.isIsomorphic(a,b));
	}
}
