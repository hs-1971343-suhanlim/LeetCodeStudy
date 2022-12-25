import java.util.Arrays;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int sol[] = new int[queries.length];
        Arrays.sort(nums);
        for(int i=0;i<sol.length;i++){
            int tmp = 0; sol[i] = nums.length;
            for(int j=0;j<nums.length;j++){
                tmp+=nums[j];
                if(tmp>queries[i]){
                    tmp-=nums[j];
                    sol[i]=j;
                    break;
                }
            }
        }
        return sol;
    }
}
public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}