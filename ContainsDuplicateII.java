import java.util.HashMap;

/*
 public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if(nums.length<=1) return false;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++) {
        	if(map.containsKey(nums[i])) {
        		if(Math.abs(map.get(nums[i])-i)<=k)
        			return true;
        		else 
            		map.put(nums[i], i);
        	}
        	else 
        		map.put(nums[i], i); 	
        }
        return false;
    }
}
public class ContainsDuplicateII {

}
