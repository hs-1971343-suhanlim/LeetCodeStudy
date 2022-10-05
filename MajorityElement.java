import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
class Solution {
	/*
	public int majorityElement(int[]nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}*/
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
       int tempKey=0, tempValue=0;
       for(int i=0;i<nums.length;i++) {
    	   if(!map.containsKey(nums[i]))
    		   map.put(nums[i], 0);
    	   else
    		   map.put(nums[i], map.get(nums[i])+1);
       }
       Set<Integer> keys = map.keySet();
       Iterator<Integer> it = keys.iterator();
       while(it.hasNext()) {
    	   int key = it.next();
    	   int value = map.get(key);
    	   if(tempValue<=value) {
    		   tempValue = value;
    		   tempKey = key;
    	   }
       }
       return tempKey;
    }
}
public class MajorityElement {
	public static void main(String arg[]) {
		Solution a = new Solution();
		int num[] = {1};
		System.out.println(a.majorityElement(num));
	}
}
