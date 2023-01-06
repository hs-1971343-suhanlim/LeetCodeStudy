import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

class Solution {
    public int findMinArrowShots2(int[][] points) {
        if(points.length==0) return 0;
        // balloons = [[7,10], [1,5], [3,6], [2,4], [1,4]] 을
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        // balloons = [[2,4], [1,4], [1,5], [3,6], [7,10]] 으로
        int ans = 1;
        int position = points[0][1];
        for(int i=1;i<points.length;i++){
            if(position>=points[i][1]){
                continue;
            }
            ans++;
            position = points[i][1];
        }
        return ans;
    }
    public int findMinArrowShots(int[][] points) {
        if(points.length==1) return 1;
        int ans = points.length;
        TreeMap<Integer,Integer> tmap = new TreeMap<Integer, Integer>();
        for(int i=0;i<points.length;i++){
            if(tmap.containsKey(points[i][0])) {
                int c = tmap.get(points[i][0])<points[i][1]?tmap.get(points[i][0]):points[i][1];
                tmap.put(points[i][0], c);
                ans--;
            }
            else {
                tmap.put(points[i][0], points[i][1]);
            }
        }
        int pre = Integer.MIN_VALUE;

        Iterator<Integer> it = tmap.keySet().iterator();
        while(it.hasNext()){
            int tmp = it.next();
            int value = tmap.get(tmp);
            if(pre>=tmp){
                ans--;
                pre = pre<value?pre:value;
            }
            else{
                pre = value;
            }
        }
        return ans;
    }
}
public class MinimumNumberofArrowstoBurstBalloons {
    public static void main(String[] args) {
        //[[10,16],[2,8],[1,6],[7,12]]
        // [[1,2],[4,5],[1,5]]
        // [[9,12],[1,10],[4,11],[8,12],[3,9],[6,9],[6,7]]
        int tmp[][] = {{9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}};
        Solution s = new Solution();
        s.findMinArrowShots(tmp);
        System.out.println("Hello world!");
    }
}