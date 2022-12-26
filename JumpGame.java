class Solution {
    private boolean ans = false;
    private void helper(int[] nums,int index){
        if(index==0) {
            ans = true;
        }
        for(int i=0;i<index;i++){
            if(nums[i]+i>=index){
                helper(nums,i);
            }
        }
    }
    public boolean canJumpTimeOver(int[] nums) {
        helper(nums,nums.length-1);
        return ans;
    }
    public boolean canJumpOtimal(int[] nums){
        int reachable =0;
        for(int i=0;i<nums.length;i++){
            if(i>reachable) return false;
            reachable = Math.max(reachable,i+nums[i]);
        }
        return true;
    }
    public boolean canJump(int[] nums) {
        int i=0,start=0,before=-1;
        while(true){
            int tmp=0;
            for(i=start;i<=start+nums[start];i++){
                if(tmp<=i+nums[i]){
                    tmp = i+nums[i];
                    start=i;
                }
                if(tmp>=nums.length-1) return true;
            }
            if(tmp>=nums.length-1) return true;
            else if (tmp==before) break;
            before = tmp;
        }
        return false;
    }
}
public class JumpGame {
    public static void main(String[] args) {
        //[1,1,2,2,0,1,1]
        //[3,2,1,0,4]
        Solution s = new Solution();
        int tmp[] = {3,2,1,0,4};
        s.canJump(tmp);
    }
}