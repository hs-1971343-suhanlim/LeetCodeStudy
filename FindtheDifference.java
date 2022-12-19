import java.util.HashMap;

class Solution {
    public char findTheDifferenceOtimal(String s, String t) {
        char ans = 0;

        for (final char c : s.toCharArray())
            ans ^= c;

        for (final char c : t.toCharArray())
            ans ^= c;

        return ans;
    }
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
        HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();
        char tmp[] = t.toCharArray();
        char smp[] = s.toCharArray();
        // 없던 문자 추가한 경우 커트
        for(int i=0;i<tmp.length;i++){
            if(tMap.containsKey(tmp[i])){
                tMap.put(tmp[i],tMap.get(tmp[i])+1);
            }
            else
                tMap.put(tmp[i],1);
            if(s.indexOf(tmp[i])==-1)
                return tmp[i];
        }
        for(int i=0;i<smp.length;i++){
            if(sMap.containsKey(smp[i])){
                sMap.put(smp[i],sMap.get(smp[i])+1);
            }
            else
                sMap.put(smp[i],1);
        }
        for(int i=0;i<tmp.length;i++){
            if(tMap.get(tmp[i])!=sMap.get(tmp[i]))
                return tmp[i];
        }
        return 'N';
    }
}
public class FindtheDifference {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.findTheDifference("abcd","abcde");
    }
}