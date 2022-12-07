import java.util.Arrays;

class Solution {
	/* use Recursive 
	public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original*=2;
                original=findFinalValue(nums,original);
            }
        }
        return original;
    }
	 */
	private int partition(int list[],int left,int right) {
		int temp=0;
		int pivot= list[left];
		int low = left;
		int high = right;
		do {
			do {// 아래 부터 큰값 찾기
				low++;
			}while(list[low]<pivot);
			do {// 위 부터 작은값 찾기
				high--;
			}while(list[high]>pivot);
		}while(low<high);
		// 피봇의 자리 바꾸기 
		temp=list[left];
		list[left]=list[high];
		list[high]=temp;
		return high; // 나누어야 하는 값의 경계 리턴
	}
	private void quickSort(int list[],int left,int right) {
		if(left<right) {
			int q = partition(list,left,right);
			quickSort(list,left,q-1);
			quickSort(list,q+1,right);
		}
	}
    public int findFinalValue(int[] nums, int original) {
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length;i++) {
        	if(nums[i]==original) 
        		original*=2;	
    	}
        return original;
    }
}
public class KeepMultiplyingFoundValuesByTwo {

}
