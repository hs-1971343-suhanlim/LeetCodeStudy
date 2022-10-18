import java.util.Arrays;

class Solution {
	/*
    public boolean isAnagram(String s, String t) {
    // 알파벳 갯수 만큼 배열을 만든다. 배열의 각 원소의 초기값은 자동으로 0
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
      	// 작업 결과 배열의 모든 원소가 처음과 같이 모두 0이면 참 그렇지 않으면 거짓
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
	 */
    public boolean isAnagram(String s, String t) {
    	char tmpS[] = s.toCharArray();
    	char tmpT[] = t.toCharArray();
    	Arrays.sort(tmpS);
    	Arrays.sort(tmpT);
    	if(tmpS.length!=tmpT.length) return false;
    	for(int i=0;i<tmpS.length;i++) {
    		if(tmpS[i]!=tmpT[i]) return false;
    	}
    	return true;
    }
}
public class ValidAnagram {

}
