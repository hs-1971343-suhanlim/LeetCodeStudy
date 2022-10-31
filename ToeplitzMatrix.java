class Solution {
	public boolean isToeplitzMatrix2(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<m-1;j++) {
				if(matrix[i][j]!=matrix[i+1][j+1])
					return false;
			}
		}
    	return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
    	for(int i=0;i<matrix[0].length;i++) {
    		int j=0; int tmp=matrix[0][i];
    		while(j+i<matrix[0].length&&j<matrix.length) {
    			if(tmp!=matrix[j][i+j]) return false;
    			j++;
    		}
    	}
    	for(int i=0;i<matrix.length;i++) {
    		int j=0; int tmp=matrix[i][0];
    		while(j<matrix[0].length&&j+i<matrix.length) {
    			if(tmp!=matrix[i+j][j]) return false;
    			j++;
    		}
    	}
    	return true;
    }
}
public class ToeplitzMatrix {

}
