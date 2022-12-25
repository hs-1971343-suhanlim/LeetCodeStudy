class Solution {
    public String toHexOtimal(int num){
        String hex[] = {"0","1","2","3","4","5","6","7","8","9","a","b","c",
                "d","e","f"};
        if(num<10&&num>=0) return Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<8&&num!=0;i++){
            sb.insert(0,hex[num&15]);
            num=num>>4;
        }
        return sb.toString();
    }
    public String toHex(int num) {
        String hex[] = {"0","1","2","3","4","5","6","7","8","9","a","b","c",
                "d","e","f"};
        String sol="";
        if(num==0) return "0";
        if(num>0) {
            while (num > 0) {
                int unit = num % 16;
                sol += hex[unit];
                num /= 16;
            }
            StringBuffer ans = new StringBuffer(sol);
            ans.reverse();
            return ans.toString();
        }
        else{
            num*=-1; num-=1; int i=0;
            int tmp[] = {15,15,15,15,15,15,15,15};
            int tmp2[] = {0,0,0,0,0,0,0,0};
            while (num > 0) {
                int unit = num % 16;
                tmp2[i++] = unit;
                //sol += hex[15-unit];
                num/=16;
            }
            for(int j=0;j<tmp.length;j++) {
                tmp[j] -= tmp2[j];
                sol+=hex[tmp[j]];
            }
            StringBuffer ans = new StringBuffer(sol);
            ans.reverse();
            return ans.toString();
        }
    }
}
public class ConvertaNumbertoHexadecimal {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.toHex(26);
    }
}