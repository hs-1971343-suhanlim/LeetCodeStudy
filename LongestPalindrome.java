import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

class Solution {
    public int longestPalindromeOtimal(String s) {
        int[] char_counts = new int[128];
        for (char c: s.toCharArray()) {
            char_counts[c]++;
        }

        int result = 0;

        for (Integer charcount: char_counts) {
            result += charcount /2 * 2;
            if (result % 2 == 0 && charcount % 2 == 1) {
                result += 1;
            }
        }
        return result;
    }
    public int longestPalindrome(String s) {
        char sArray[] = s.toCharArray();
        int ans=0,odd=0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<sArray.length;i++){
            if(map.containsKey(sArray[i])){
                map.put(sArray[i],map.get(sArray[i])+1);
            }
            else{
                map.put(sArray[i],1);
            }
        }
        Set<Character> set = map.keySet();
        Iterator<Character> it = set.iterator();
        while(it.hasNext()){
            int value = map.get(it.next());
            if(value%2==0){
                ans+=value;
            }
            else{
                odd=1;
                ans+=value-1;
            }
        }
        return ans+odd;
    }
}
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}