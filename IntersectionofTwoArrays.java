import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	HashSet<Integer> set = new HashSet<Integer>();
    	int index=0;
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	for(int i=0;i<nums1.length;i++) {
    		for(int j=0;j<nums2.length;j++) {
    			if(nums1[i]==nums2[j])
    				set.add(nums1[i]);
    		}
    	}
    	int sol[] = new int[set.size()];
    	Iterator<Integer> it = set.iterator();
    	while(it.hasNext()) {
    		sol[index++] = it.next();
    	}
    	return sol;
    }
}
public class IntersectionofTwoArrays {
	
}
