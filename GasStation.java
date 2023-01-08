import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

class Solution {
    // 시간 복잡도 O(n) 공간 복잡도 O(1)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int curGas = 0;
        int ans = 0;
        // 해당 반복을 통해 원형으로 돌 수 있는 시작 정류소가 존재할 경우는 검출 가능하나
        // 가능한 정류소가 아애 존재 하지 않는 경우는 검출 불가능 따라서 totalGas변수 추가 사용
        for(int i=0;i<gas.length;i++){
            curGas +=(gas[i]-cost[i]);
            if(curGas<0){
                totalGas += curGas;
                curGas = 0;
                ans = i+1;
            }
        }
        totalGas += curGas;
        // 만약 전체 totalGas의 양이 -라면 가능한 정류소가 없다는 뜻
        // why? 모든 정류장을 이동 할때 (얻는 가스 - 소비하는 가스) < 0 인 상황이므로
        return totalGas<0?-1:ans;
    }
    public int canCompleteCircuit1(int[] gas, int[] cost) {
        if(gas.length==1&&gas[0]>=cost[0]) return 0;
        int remain = 0;
        Vector<Integer> v = new Vector<Integer>();
        // 시작점이 가능한 곳 만 Vector에 추가
        for(int i=0;i<gas.length;i++){
            // if(gas[i]-cost[i]>=0)시 time out
            if(gas[i]-cost[i]>0) {
                v.add(i);
            }
            remain+=gas[i];
            remain-=cost[i];
        }
        // 만약 시작점이 가능한 곳이 존재x 라면 종료
        if(v.size()==0||remain<0) return -1;
        //v.removeIf(n->(gas[n]-cost[n]==0));
        // 더 빠르게 한다면... 음 gas - cost의 값이 제일 작은 곳 혹은 제일 큰 곳 부터 시작?
        // 1. 시작점 설정하기, 2. 다음 칸으로 이동 결과가 +-0이면 스킵하기?
        // 모든 결과는 유일할 수 밖에 없는 세트를 제공한다고 함
        // gas[i]-cost[i] 값을 기준으로 내림차순 정렬
        Collections.sort(v, new Comparator<Integer>() {
            public int compare(Integer p1, Integer p2) {
                if(gas[p1]-cost[p1] > gas[p2]-cost[p2]) {
                    return -1; //맨 앞으로
                }
                else if(gas[p1]-cost[p1] == gas[p2]-cost[p2]) {
                    return 0;
                }
                else {
                    return 1; // 맨 뒤로
                }
            }
        });
        for(int i=0;i<v.size();i++){
            for(int j=0;j<gas.length;j++){
                if(remain<0) break;
                int index = v.get(i)+j;
                remain+=gas[index%gas.length];
                remain-=cost[index%gas.length];
            }
            if(remain>=0)
                return v.get(i);
            else
                remain = 0;
        }

        return -1;
    }
}
public class GasStation {
    public static void main(String[] args) {
        //[5,1,2,3,4], [4,4,1,5,1]
        int gas[] = {5,1,2,3,4};
        int cost[] = {4,4,1,5,1};
        Solution s = new Solution();
        s.canCompleteCircuit(gas, cost);
        System.out.println("Hello world!");
    }
}