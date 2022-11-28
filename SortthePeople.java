import java.util.Arrays;
import java.util.HashMap;

class Solution {
	private int save[];
	private void merge(int list[],int left,int mid,int right) {
		int i=left;
		int j=mid+1;
		int k=left;
		while(i<=mid&&j<=right) {
			if(list[i]<=list[j])
				save[k++]=list[i++];
			else
				save[k++]=list[j++];
		}
		// 순서가 중요하다.
		if(i>mid) {
			for(int t=j;t<=right;t++)
				save[k++]=list[t];
		}
		else {
			for(int t=i;t<=mid;t++)
				save[k++]=list[t];
		}
		for(int t=left;t<=right;t++)
			list[t] = save[t];
	}
	private void mergeSort(int list[],int left,int right) {
		int mid=0;
		if(left<right) {
			mid = (left+right)/2;
			mergeSort(list,left,mid);
			mergeSort(list,mid+1,right);
			merge(list,left,mid,right);
		}
	}
    public String[] sortPeople(String[] names, int[] heights) {
    	String sol[] = new String[names.length];
    	save = new int[names.length];
    	HashMap<Integer,String> map = new HashMap<Integer,String>();
    	for(int i=0;i<names.length;i++) {
    		map.put(heights[i],names[i]);
    	}
    	mergeSort(heights,0,heights.length-1);
        for(int i=0;i<names.length;i++) {
        	sol[i]=map.get(heights[names.length-1-i]);
        }
        System.out.println("cutLine");
        return sol;
    }
}
public class SortthePeople {
	public static void main(String args[]) {
		Solution s = new Solution();
		String arg[]={"Mary","John","Emma"};
		int tmp[]= {180,165,170};
		s.sortPeople(arg, tmp);
	}
}
