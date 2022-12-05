import java.util.Arrays;

class Solution {
	/*
	public int heightChecker(int[] heights) {
        int[] heightToFreq = new int[101];
        
        for (int height : heights) {
            heightToFreq[height]++;
        }
        
        int result = 0;
        int curHeight = 0;
        
        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }
            
            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }
        
        return result;
    }
	 */
	public void insertSort(int list[]) {
		int j=0;
		for(int i=1;i<list.length;i++) {
			int tmp = list[i];
			for(j=i-1;j>=0&&list[j]>tmp;j--) {
				list[j+1]=list[j];
			}
			list[j+1]=tmp;
		}
	}
    public int heightChecker(int[] heights) {
    	int sol=0;
        int tmp[] = Arrays.copyOf(heights, heights.length);
    	insertSort(heights);
        for(int i=0;i<tmp.length;i++) {
        	if(heights[i]!=tmp[i])
        		sol++;
        }
    	return sol;
    }
}
public class HeightChecker {
	public static void main(String args[]) {
		Solution s = new Solution();
		int tmp[] = {4,3,1,2};
		s.heightChecker(tmp);
		s.insertSort(tmp);
		System.out.println("cut");
	}
}
