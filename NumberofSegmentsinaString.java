class Solution {
    // 공간 복잡도 O(n) 시간 복잡도 O(n)
    public int countSegmentsOtimal2(String s) {
        // return ("x "+s).split(" +").length-1;
        return ("x "+s).split("//s+").length-1;
    }
    // 공간 복잡도 O(1) 시간 복잡도 O(n)
    public int countSegmentsOtimal1(String s) {
        int ans =0;
        for(int i=0;i<s.length();i++){
            if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' ')
                ans++;
        }
        return ans;
    }
    // 공간 복잡도 O(n) 시간 복잡도 O(n)
    public int countSegments(String s) {
        if(s.isBlank()) return 0;
        int ans = 0;
        s= s.trim();
        boolean sArray[] = new boolean[s.length()];
        char sSpilit[] = s.toCharArray();
        for(int i=0;i<sSpilit.length;i++){
            if(sSpilit[i]==' ')
                sArray[i] = false;
            else
                sArray[i] = true;
        }
        for(int i=0;i<sArray.length-1;i++){
            if(sArray[i]&&!sArray[i+1])
                ans++;
        }

        return ans+1;
    }
}
public class NumberofSegmentsinaString {
    public static void main(String[] args) {
        Solution s = new Solution();
        // "Of all the gin joints in all the towns in all the world,   "
        s.countSegmentsOtimal2("Hello, my name is John");
        System.out.println("Hello world!");
    }
}