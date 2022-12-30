class Solution {
    public String addStringsOtimal(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry =0;
        for(int i=num1.length()-1,j=num2.length()-1;i>=0||j>=0;i--,j--){
            int x = i<0?0:num1.charAt(i) - '0';
            int y = j<0?0:num2.charAt(j) - '0';
            sb.append((x+y+carry)%10);
            carry = (x+y+carry)/10;
        }
        return sb.reverse().toString();
    }
    private int upCount = 0;
    private char helper(char op1,char op2){
        int sum = (op1-'0')+(op2-'0')+upCount;
        upCount = sum/10;

        return (char)(sum%10+'0');
    }
    private char helper2(char op1){
        int sum = (op1-'0')+upCount;
        upCount = sum/10;

        return (char)(sum%10+'0');
    }
    public String addStrings(String num1, String num2) {
        StringBuilder ans = new StringBuilder("");
        char num1Array[] = num1.toCharArray();
        char num2Array[] = num2.toCharArray();
        int num1Index =num1.length()-1, num2Index=num2.length()-1;
        while(num1Index>=0&&num2Index>=0){
            ans.insert(0,helper(num1Array[num1Index],num2Array[num2Index]));
            num1Index--; num2Index--;
        }
        for(int i=num1Index;i>=0;i--){
            ans.insert(0,helper2(num1Array[i]));
        }
        for(int i=num2Index;i>=0;i--){
            ans.insert(0,helper2(num2Array[i]));
        }
        if(upCount>0)
            ans.insert(0,upCount);
        return ans.toString();
    }
}
public class AddStrings {
    public static void main(String[] args) {
        Solution s = new Solution();
        String op1 = "1";
        String op2 = "9";
        s.addStrings(op1,op2);
    }
}