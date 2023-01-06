import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int ans = 0;
        int max = costs[0];
        for (int cost:costs) {
            if(max<=cost)
                max = cost;
        }
        // 아이스크림 제일 비싼 가격+1 만큼의 배열을 만듬
        int iceCreamNumArray[] = new int[max+1];
        for (int cost:costs) {
            iceCreamNumArray[cost]++;
        }
        for(int i=1;i<iceCreamNumArray.length;i++){
            if(iceCreamNumArray[i]==0)
                continue;
            if(coins<i)
                break;
            // 남아 있는 코인의 수가 해당 아이스크림 가격의 아이스크림 전부를 구매 못 하는 경우
            // 가능한 갯수만 구매 하도록
            int count = Math.min(iceCreamNumArray[i],coins/i);
            coins -= i * count;
            ans+=count;
        }
        return ans;
    }
    public int maxIceCream2(int[] costs, int coins) {
        // 시간 복잡도 O(nlog n) 공간 복잡도 O(nlog n) - sort 함수 때문에
        Arrays.sort(costs);
        int ans = 0;
        for (int price: costs) {
            if(coins-price<0)
                break;
            coins-=price;
            ans++;
        }
        return ans;
    }
}
public class MaximumIceCreamBars {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}