import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
    	boolean flag=true;

    	for(int i=0;i<nums.length;i++) {
    		if(nums[i]==0) flag = false;
    	}
    	if(flag) return 0;
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length-1;i++) {
        	if(nums[i]!=nums[i+1]-1)
        		return nums[i]+1;
        }
        return nums[nums.length-1]+1;
    }
}
public class MissingNumber {

}
