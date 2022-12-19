class Solution {
    public boolean isSubsequence(String s, String t) {
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        int j=0,correctCheck=0;
        for(int i=0;i<sArray.length;i++){
            char target = sArray[i];
            for(;j<tArray.length;j++){
                if(target==tArray[j]) {
                    correctCheck++;
                    j++;
                    break;
                }
            }
        }
        // return correctCheck!=sArray.length?false:true; 해도 되는데 속도가 느려진다.
        if(correctCheck!=sArray.length)
            return false;
        return true;
    }
}
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}