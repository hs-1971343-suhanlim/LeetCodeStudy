import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        List<Integer> ans = new ArrayList<Integer>();
        for (int num:nums) {
            set.add(num);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i))
                ans.add(i);
        }
        return ans;
    }
    public boolean binarySearch(int[] nums, int target){
        int start=0; int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]<target)
                start=mid+1;
            else if(nums[mid]>target)
                end=mid-1;
            else
                return true;
        }
        return false;
    }
    public List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            if(!binarySearch(nums,i))
                ans.add(i);
        }
        return ans;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int[] tmpArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            tmpArray[i] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            tmpArray[tmpArray[i]-1] = Math.abs(nums[tmpArray[i]-1])*-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans.add(i+1);
            }
        }
        return ans;
    }
    public List<Integer> findDisappearedNumbers4(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int index=-1;
        for(int i=0;i<nums.length;i++){
            // 만약 이전 반복으로 음수가 된 경우
            if(nums[i]<0){
                index = nums[i]*-1-1;
            }
            // 그렇지 않은 경우
            else{
                index = nums[i]-1;
            }
            // 찾은 값의 인덱스값 을 음수화
            if(nums[index]>0){
                nums[index] = -nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int tmp[] = {4,3,2,7,8,2,3,1};
        s.findDisappearedNumbers(tmp);
        System.out.println();
    }
}