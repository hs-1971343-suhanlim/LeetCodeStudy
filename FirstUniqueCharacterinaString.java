import java.util.HashMap;

class Solution {
	 public int firstUniqCharOtimal(String s) {
	        int ans = Integer.MAX_VALUE;
	        // indexOf 문자열에서 인덱스 번호를 리턴해주는 함수
	        for(char c='a'; c<='z';c++){
	            int index = s.indexOf(c);
	            if(index!=-1&&index==s.lastIndexOf(c)){
	                ans = Math.min(ans,index);
	            }
	        }

	        return ans==Integer.MAX_VALUE?-1:ans;

	    }
	public int test(String s) {
		String tmp[] = s.split("");
		for(int i=0;i<tmp.length;i++) {
			int index = s.indexOf(tmp[i]);
			if(index!=-1&&index==s.lastIndexOf(c)) {
				return index;
			}
		}
		return -1;
	}
    public int firstUniqChar(String s) {
        String tmp[] = s.split("");
    	HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<tmp.length;i++) {
        	if(map.containsKey(tmp[i])) {
        		map.put(tmp[i], map.get(tmp[i])+1);
        	}
        	else {
        		map.put(tmp[i], 1);
        	}
        }
        
        if(map.containsValue(1)) {
        	for(int i=0;i<tmp.length;i++) {
        		if(map.get(tmp[i])==1)
        			return i;
        		
        	}
        }
         return -1;
    }
}
public class FirstUniqueCharacterinaString {

}
