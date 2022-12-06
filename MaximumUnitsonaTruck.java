class Solution {
	// time complex O(x^2) space complex O(1)
	//  boxSort can replace this "Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));"
	private void boxSort(int [][]box) {
		int j=0; int tmp[];
		for(int i=1;i<box.length;i++) {
			tmp = box[i];
			for(j=i-1;j>=0&&(box[j][1]>tmp[1]);j--)
				box[j+1]=box[j];
			box[j+1]=tmp;
		}
	}
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sol=0; int boxIndex=boxTypes.length-1;
    	boxSort(boxTypes);
        while(truckSize>0) {
        	if(boxIndex<0) break;
        	if(truckSize>=boxTypes[boxIndex][0]) {
        		sol+=boxTypes[boxIndex][0]*boxTypes[boxIndex][1];
        		truckSize-=boxTypes[boxIndex][0];
        		boxIndex--;
        	}
        	else {
        		sol+=truckSize*boxTypes[boxIndex][1];
        		truckSize=0;
        	}
        }
        return sol;
    }
}
public class MaximumUnitsonaTruck {
	public static void main(String args[]) {
		Solution s = new Solution();
		int tmp[][]= {{1,3},{2,2},{3,1}};
		s.maximumUnits(tmp, 4);
	}
}
