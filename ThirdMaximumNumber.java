import java.util.Arrays;
import java.util.TreeSet;

class Solution {
    public int thirdMaxOtimal(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            if(max1<nums[i]){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(max1>nums[i]&&max2<nums[i]){
                max3 = max2;
                max2 = nums[i];
            }
            else if(max2>nums[i]&&max3<nums[i]){
                max3 = nums[i];
            }

        }
        return max3 == Long.MIN_VALUE?(int)max1:(int)max3;
    }
    public int thirdMaxOtimal2(int[] nums) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int num:nums) {
            if(set.contains(num)) continue;
            if(set.size()==3){
                if(set.first() < num){
                    set.pollFirst();
                    set.add(num);
                }
            }
            else{
                set.add(num);
            }
        }
        if(set.size()==3) return set.first();

        return set.last();
    }
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int tmp = nums[nums.length-1];
        int count=2;
        for(int i=nums.length-1;i>=0;i--){
            if(count==0) break;
            if(nums[i]<tmp){
                count--; tmp=nums[i];
            }
        }
        //if(count==0) return tmp;
        //else return nums[nums.length-1];
        return count==0?tmp:nums[nums.length-1];
    }
}
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}