import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
class Solution {
    public boolean containsDuplicate(int[] nums) {
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length-1;i++) {
    		if(nums[i]==nums[i+1]) return true;
    	}
    	return false;
    }
}*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
    	Set<Integer> set = new HashSet<>();
    	for(int num : nums) {
    		if(!set.add(num)) return true;
    	}
    	return false;
    }
}
public class ContainsDuplicate {

}
