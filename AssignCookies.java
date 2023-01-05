import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

class Solution {
    public int findContentChildren1(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int ans =0;
        while(i<g.length&&j<s.length){
            if(g[i]<=s[j]){
                ans++; i++; j++;
            }
            else{
                j++;
            }
        }

        return ans;
    }
    // TreeMap의 Integer ceilingKey(Integer)을 사용
    public int findContentChildren(int[] g, int[] s) {
        int ans=0;
        // ceilingkey(Integer key) 라면 key의 값 보다 크거나 같은 값중에서 제일 작은 key값을 리턴
        // key는 쿠키(박스) valse는 같은 개수를 가진 쿠키(박스)의 수
        TreeMap<Integer,Integer> tmap = new TreeMap<Integer,Integer>();
        /* containsKey() 의 시간 복잡도는 log n 임으로 안쓰는 것이 더 바람직
        for (int cookie:s) {
            if(tmap.containsKey(cookie))
                tmap.put(cookie,tmap.get(cookie)+1);
            else
                tmap.put(cookie,1);
        }
        개선한 tmap 초기화 방법*/
        for (int cookie:s) {
            Integer n = tmap.get(cookie);
            n = n==null?0:n;
            tmap.put(cookie,n+1);
        }

        for (int childG:g) {
            // ceilingKey를 이용하여 각 아이들에게 줄 수 있는 쿠키(박스)의 경우를 가져오고
            Integer target = tmap.ceilingKey(childG);
            // 만약 해당 쿠키(박스)가 존재한다면
            if(target!=null){
                Integer n = tmap.get(target);
                ans++; // 아이들의 수 +1
                // valse 값이 0이 되어야 한다면 해당 쿠키(박스) 제거
                if (n <= 1)
                    tmap.remove(target);
                // valse(같은 쿠키의 수)를 -1
                else
                    tmap.put(target, n - 1);
            }
        }
        return ans;
    }
}
public class AssignCookies {
    public static void main(String[] args) {
        Solution s = new Solution();
        int tmp1[] = {10,9,8,7};
        int tmp2[] = {5,6,7,8};

        s.findContentChildren(tmp1,tmp2);
        System.out.println("Hello world!");
    }
}