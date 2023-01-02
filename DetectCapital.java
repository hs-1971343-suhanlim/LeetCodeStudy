class Solution {
    public boolean detectCapitalUse2(String word) {
        //시간복잡도 O(word.matches()), 공간복잡도 O(1)
        // 1. "ABC" 는 [A-Z]* 으로 걸러내는 것이 가능
        // 2. "abc" 는 [a-z]* 으로 걸러내는 것이 가능
        // 3. "Abc" 는 [A-Z][a-z]* 으로 걸러내는 것이 가능
        // 1+2+3을 | or 연산자로 합침
        return word.matches("[A-Z]*|[a-z]*|[A-Z][a-z]*");
    }
    public boolean upperCheck(String word){
        for(int i=0;i<word.length();i++){
            //Character.isUpperCase()로 대체 가능
            if('A'>word.charAt(i)||'Z'<word.charAt(i))
                return false;
        }
        return true;
    }
    public boolean lowerCheck(String word){
        //Character.isLowerCase()로 대체 가능
        for(int i=0;i<word.length();i++){
            if('a'>word.charAt(i)||'z'<word.charAt(i))
                return false;
        }
        return true;
    }
    public boolean firstCheck(String word){
        //Character.isUpperCase()로 대체 가능
        if('A'>word.charAt(0)||'Z'<word.charAt(0))
            return false;
        for(int i=1;i<word.length();i++){
            //Character.isLowerCase()로 대체 가능
            if('a'>word.charAt(i)||'z'<word.charAt(i))
                return false;
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        //시간복잡도 O(n), 공간복잡도 O(1)
        return upperCheck(word)||lowerCheck(word)||firstCheck(word);
    }
}
public class DetectCapital {
    public static void main(String[] args) {
        Solution s = new Solution();
        String tmp = "USA";
        System.out.println(tmp.matches("[A-Z]*"));
        System.out.println(s.lowerCheck("USA"));
        System.out.println(s.firstCheck("USA"));

        s.detectCapitalUse("USA");
        System.out.println("Hello world!");
    }
}