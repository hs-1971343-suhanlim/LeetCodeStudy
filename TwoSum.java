import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	for(int i=0;i<nums.length;i++) {
    		int current = nums[i];
    		int diff = target-current;
    		if(map.containsKey(diff)) {
    			return new int[] {map.get(diff),i};
    		}
    		map.put(nums[i], i);
    	}
    	return null;
    }
}
public class TwoSum {

}
