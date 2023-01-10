class Solution {
    // 해당 값의 비트 자리수의 최대 값이 될 수 있는 경우를 반환
    private int getMaxBitValue(int n){
        int i = 0;
        int max = 0;
        // 비트 자리수 계산
        while(n!=0){
            n/=2;
            i++;
        }
        // 해당 비트 자리수의 최대 값 구하기
        for(int bit=i-1;bit>=0;bit--){
            max+=Math.pow(2,bit);
        }
        return max;
    }
    public int findComplement(int num) {

        return num^getMaxBitValue(num);
    }

    public int findComplement2(int num) {
        return ~num & (Integer.highestOneBit(num)-1);
    }
}
public class NumberComplement {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.findComplement(5);
        System.out.println("Hello world!");
    }
}