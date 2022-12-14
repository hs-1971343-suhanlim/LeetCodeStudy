import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Solution {
	  public int[] intersectOtimal(int[] nums1, int[] nums2) {
		  	Arrays.sort(nums1);
				Arrays.sort(nums2);
				ArrayList<Integer> common = new ArrayList<>();
				int i = 0;
				int j=0;
				while(i!=nums1.length && j!=nums2.length) {
				if(nums1[i]<nums2[j]) {
				    i++;
				}
				
				else if(nums1[i]>nums2[j]) {
					j++;
				}
				
				else {
				
				    common.add(nums1[i]);
					i++;
					j++;
			    }
				}	
				int [] intersect = new int[common.size()];
		      for(int k=0; k<intersect.length;k++) {
		    	  intersect[k]= common.get(k);
		      }
		      return intersect;
			    }
    public int[] intersect(int[] nums1, int[] nums2) {
    	LinkedList<Integer> sol = new LinkedList<Integer>();
    	LinkedList<Integer> tmp = new LinkedList<Integer>();
    	//Arrays.sort(nums1); Arrays.sort(nums2);
    	for(int i=0;i<nums1.length;i++) 
    		tmp.add(nums1[i]);
    	for(int i=0;i<nums2.length;i++) {
    		for(int j=0;j<tmp.size();j++) {
    			if(tmp.get(j)==nums2[i]) {
    				sol.add(nums2[i]);
    				tmp.remove(j);
    				break;
    			}
    		}
    	}
    	int solve[]= new int[sol.size()]; 
    	for(int i=0;i<sol.size();i++) {
    		solve[i] = sol.get(i);
    	}
    	return solve;
    }
}
public class IntersectionofTwoArraysII {

}
