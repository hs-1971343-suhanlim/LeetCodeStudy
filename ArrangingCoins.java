class Solution {

    // 시간 복잡도 O(1) 공간 복잡도 O(1)
    public int arrangeCoins4(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }

    // 시간 복잡도 O(log n) 공간 복잡도 O(1)
    public int arrangeCoins3(int n) {
        long start=0,end=n; // 0~n의 범위에서 탐색
        long k,curr;
        while(start<=end){
            // start + (start-end)/2 도 가능?
            k = (start+end)/2;
            curr = k*(k+1)/2;
            // k값을 찾은 상태
            if(curr==n) return (int)k;
            // 찾는 k값이 해당 값보다 순서상 왼쪽에 있는(작은) 상태
            if(n<curr){
                end = k-1;
            }
            // 찾는 k값이 해당 값보다 순서상 오른쪽에 있는(큰) 상태
            else{
                start = k+1;
            }
        }
        // 반복에서 벗어 났다는 것은 최하층이 불완전 한 채로 존재 한다는 것
        // 따라서 start 만큼 층이 존재하나 전부 채워진 층은 end 층 까지
        return (int)end;
    }

    // 시간 복잡도 O(n) 공간 복잡도 O(1)
    public int arrangeCoins(int n) {
        int i=1;
        while(n>0){
            n-=i++;
        }
        if(n==0) return i-1;
        return i;
    }
}
public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}