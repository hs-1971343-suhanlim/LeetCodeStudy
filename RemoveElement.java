
class Solution {
    public int removeElement(int[] nums, int val) {
    	if(nums.length==1&&nums[0]!=val)
    		return nums.length;
        int tmpArray[]=new int[nums.length];
        int k=0;
    	for(int i=0;i<nums.length;i++) {
        	if(nums[i]!=val)
        		tmpArray[k++]=nums[i];
        }
    	for(int i=0;i<nums.length;i++) {
        	nums[i]=tmpArray[i];
        }
    	return k;
    }
}
public class RemoveElement {

}
