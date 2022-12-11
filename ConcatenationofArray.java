class Solution {
    public int[] getConcatenation(int[] nums) {
        int sol[]= new int[nums.length*2];
        for(int i=0;i<nums.length;i++) {
        	sol[i]=nums[i];
        	sol[i+nums.length]=nums[i];
        }
        return sol;
    }
}
public class ConcatenationofArray {

}
