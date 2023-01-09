class Solution {
    // 시간복잡도 O(nlog n) // 공간복잡도 O(1)
    private boolean isSubsequence(String targte, String s){
        StringBuilder tmp = new StringBuilder("");
        // targte을 반복하여 이어붙여서 s와 같다면 true 아니면 false
        for(int i=0;i<s.length()/targte.length();i++){
            tmp.append(targte);
        }
        if(tmp.toString().equals(s)) return true;
        else return false;
    }
    public boolean repeatedSubstringPattern(String s) {
        char sArray[] = s.toCharArray();
        String target = "";
        // ex "abcde" 라면 "a" "ab"순으로 확인
        // 만약 target의 문자열의 길이가 절반을 넘어가면 false 이므로 절반까지만 반복
        for(int i=0;i<sArray.length/2;i++){
            target +=sArray[i];
            if(isSubsequence(target,s))
                return true;
        }
        return false;
    }
    public boolean repeatedSubstringPattern1(String s) {
        int length = s.length();
        String copy = "";
        for(int i=1;i<=s.length()/2;i++){
            if(length%i==0){
                copy = s.substring(0,i);
                copy = copy.repeat(length/i);
                if(copy.equals(s))
                    return true;
            }
        }
        return false;
    }
    public boolean repeatedSubstringPattern2(String s){
        return (s+s).indexOf(s,1)<s.length();
    }
}
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        //"abab"
        Solution s = new Solution();
        s.repeatedSubstringPattern("abab");
        System.out.println("Hello world!");
    }
}